package com.example.demo.servicios;

import com.example.demo.entidades.Autor;
import com.example.demo.repositorios.AutorRepositorio;
import com.example.demo.repositorios.BaseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepositorio autorRepositorio;
    public AutorServiceImpl(BaseRepositorio<Autor, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
