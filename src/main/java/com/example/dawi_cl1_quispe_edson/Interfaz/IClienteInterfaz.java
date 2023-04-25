package com.example.dawi_cl1_quispe_edson.Interfaz;

import java.util.List;
import com.example.dawi_cl1_quispe_edson.model.Cliente;

public interface IClienteInterfaz {
    void save(Cliente cliente);

    List<Cliente> getAll();
}
