package com.example.dawi_cl1_quispe_edson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dawi_cl1_quispe_edson.Interfaz.IAreaInterfaz;
import com.example.dawi_cl1_quispe_edson.Interfaz.IClienteInterfaz;
import com.example.dawi_cl1_quispe_edson.model.Areas;
import com.example.dawi_cl1_quispe_edson.model.Cliente;

import jakarta.validation.Valid;

@Controller
public class ClienteController {
    @Autowired
    IClienteInterfaz clienteInterfaz;

    @Autowired
    IAreaInterfaz areaInterfaz;

    @GetMapping(value = "/clientes")
    public String clientes(Model model, Integer idArea) {
        List<Cliente> clientes = clienteInterfaz.getAll();
        List<Areas> areas = areaInterfaz.getAll();

        model.addAttribute("clientes", clientes);
        model.addAttribute("areas", areas);

        return "APP-QUISPE-CONSULTA";
    }

    @PostMapping("/clientes")
    public String clientesByArea(Model model, Integer idArea) {
        Areas area = areaInterfaz.findById(idArea);
        List<Cliente> clientes = null;

        if (area == null) {
            clientes = clienteInterfaz.getAll();
        } else {
            clientes = area.getClientes();
        }

        List<Areas> areas = areaInterfaz.getAll();

        model.addAttribute("areas", areas);
        model.addAttribute("clientes", clientes);
        return "APP-QUISPE-CONSULTA";
    }

    @GetMapping(value = "/clientes/crear")
    public String saveFormCliente(Model model) {
        List<Areas> areas = areaInterfaz.getAll();
        Cliente cliente = new Cliente();

        model.addAttribute("cliente", cliente);
        model.addAttribute("areas", areas);

        return "APP-QUISPE-REGISTRO";
    }

    @PostMapping(value = "/clientes/crear")
    public String saveCliente(@Valid @ModelAttribute(name = "cliente") Cliente cliente,
            BindingResult result,
            RedirectAttributes redirectAttributes,
            Model model) {

        if (result.hasErrors()) {
            List<Areas> areas = areaInterfaz.getAll();
            model.addAttribute("areas", areas);

            return "APP-QUISPE-REGISTRO";
        }

        clienteInterfaz.save(cliente);
        redirectAttributes.addFlashAttribute("mensaje", "Cliente agregado correctamente");

        return "redirect:/clientes/crear";
    }
}
