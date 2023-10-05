package com.example.demo.repositorios;

import com.example.demo.entidades.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

//no repository bean se usa para q no se instancie
@NoRepositoryBean
public interface BaseRepositorio<E extends Base, Id extends Serializable> extends JpaRepository<E, Id> {

}
