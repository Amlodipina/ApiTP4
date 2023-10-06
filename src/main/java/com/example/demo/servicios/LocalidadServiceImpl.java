package com.example.demo.servicios;

import com.example.demo.entidades.Localidad;
import com.example.demo.repositorios.BaseRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepositorio<Localidad, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
