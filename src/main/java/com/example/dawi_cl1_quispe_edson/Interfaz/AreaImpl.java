package com.example.dawi_cl1_quispe_edson.Interfaz;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dawi_cl1_quispe_edson.model.Areas;
import com.example.dawi_cl1_quispe_edson.repository.IAreaRepository;

@Service
public class AreaImpl implements IAreaInterfaz {

    @Autowired
    IAreaRepository iAreaRepository;

    @Override
    public List<Areas> getAll() {
        return iAreaRepository.findAll();
    }

    @Override
    public Areas findById(Integer id) {
        Optional<Areas> area = iAreaRepository.findById(id);

        if (area.isEmpty()) {
            return null;
        }

        return area.get();
    }

}
