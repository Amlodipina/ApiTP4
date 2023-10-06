package com.example.demo.servicios;

//en esta clase vamos a declarar todos los metodos principales q necesitamos, con las operaciones, get, put, delete y post

import com.example.demo.entidades.Base;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, Id extends Serializable>{
    public List<E> findAll() throws Exception;
    public E findById(Id id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Id id, E entity) throws Exception;
    public boolean delete(Id id) throws Exception;

}
