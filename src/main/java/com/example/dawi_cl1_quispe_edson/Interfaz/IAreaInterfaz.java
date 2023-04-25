package com.example.dawi_cl1_quispe_edson.Interfaz;

import java.util.List;

import com.example.dawi_cl1_quispe_edson.model.Areas;

public interface IAreaInterfaz {
    List<Areas> getAll();

    Areas findById(Integer id);
}
