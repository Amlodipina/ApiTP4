package com.example.demo.controladores;

import com.example.demo.entidades.Persona;
import com.example.demo.servicios.PersonServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//CrossOrigin nos permite dar acceso a nuestra api desde distintos origenes (clientes)
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonServiceImpl>{


}
