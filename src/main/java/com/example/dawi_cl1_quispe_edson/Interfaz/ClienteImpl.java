package com.example.dawi_cl1_quispe_edson.Interfaz;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dawi_cl1_quispe_edson.model.Cliente;
import com.example.dawi_cl1_quispe_edson.repository.IClienteRepository;

@Service
public class ClienteImpl implements IClienteInterfaz {
    @Autowired
    IClienteRepository iClienteRepository;

    @Override
    public void save(Cliente cliente) {
        iClienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return iClienteRepository.findAll();
    }

}
