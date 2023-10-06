package com.example.demo.servicios;

import com.example.demo.entidades.Persona;
import com.example.demo.repositorios.BaseRepositorio;
import com.example.demo.repositorios.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepositorio personaRepositorio;

    public PersonServiceImpl(BaseRepositorio<Persona, Long> baseRepositorio, PersonaRepositorio personaRepositorio) {
        super(baseRepositorio);
        this.personaRepositorio = personaRepositorio;
    }
}
