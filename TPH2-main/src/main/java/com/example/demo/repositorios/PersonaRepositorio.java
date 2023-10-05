package com.example.demo.repositorios;


import com.example.demo.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Esta interfaz va a ser un DAO, un patron que separa la logica del acceso a datos,
// es decir este repositorio va a comunicarse con la bd
@Repository
public interface PersonaRepositorio extends BaseRepositorio<Persona, Long> {

}

