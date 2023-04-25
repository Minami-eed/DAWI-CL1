package com.example.dawi_cl1_quispe_edson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dawi_cl1_quispe_edson.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
