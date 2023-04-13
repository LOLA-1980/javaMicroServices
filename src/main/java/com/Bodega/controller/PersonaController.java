package com.Bodega.controller;

import com.Bodega.entity.Persona;
import com.Bodega.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("devPersona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/persona/{id}")
    public Optional<Persona> buscarPersona(@PathVariable int id){
        return personaService.getPersona(id);
    }

    @GetMapping("/departamentos")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping("/insertar")
    public Persona insertarPersona(@RequestBody Persona persona){
        return personaService.insertarPersona(persona);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        personaService.eliminar(id);
    }

    @PutMapping("/modificar")
    public Persona modificar(@RequestBody Persona persona){
        return personaService.actualizar(persona);
    }
}
