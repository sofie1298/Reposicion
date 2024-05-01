package hn.unah.lenguajes1900.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.demo.entities.Equipos;
import hn.unah.lenguajes1900.demo.services.impl.EquiposServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")

public class EquiposController {
    @Autowired
    private EquiposServiceImpl equiposServiceImpl;
    @PostMapping("/equipo/crear")
    public Equipos crearEquipo(@RequestBody Equipos equipos){
        return this.equiposServiceImpl.crearEquipo(equipos);

    }
     @DeleteMapping("/equipo/eliminar/{codigoEquipo}")
    public String eliminarEquipo(@PathVariable Long codigoEquipo) {
        return equiposServiceImpl.eliminarEquipo(codigoEquipo);
    }
    @GetMapping("/equipo/buscar")
    public Equipos buscarEquipo(@RequestParam long codigoEquipo){
        return equiposServiceImpl.buscarEquipo(codigoEquipo);
    }
    
}
