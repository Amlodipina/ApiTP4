package com.example.demo.servicios;

import com.example.demo.entidades.Base;
import com.example.demo.entidades.Persona;
import com.example.demo.repositorios.BaseRepositorio;
import jakarta.transaction.Transactional;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends Base, Id extends Serializable> implements BaseService<E, Id> {
    protected BaseRepositorio<E, Id> baseRepositorio;

    public BaseServiceImpl(BaseRepositorio<E, Id> baseRepositorio) {
        this.baseRepositorio = baseRepositorio;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception{
        try {
            List<E> entities = baseRepositorio.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E findById(Id id) throws Exception{
        try {
            Optional<E> entitiesOptional = baseRepositorio.findById(id);
            return entitiesOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception{
        try {
            entity = baseRepositorio.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    @Transactional
    public E update(Id id, E entity) throws Exception{
        try {
           Optional<E> entityOptional = baseRepositorio.findById(id);
           E ent = entityOptional.get();
           ent = baseRepositorio.save(entity);
           return ent;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Id id) throws Exception{
        try {
           if(baseRepositorio.existsById(id)){
               baseRepositorio.deleteById(id);
               return true;
           }else{
               throw new Exception();
           }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
