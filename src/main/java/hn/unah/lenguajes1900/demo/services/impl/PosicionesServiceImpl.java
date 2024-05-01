package hn.unah.lenguajes1900.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Posiciones;
import hn.unah.lenguajes1900.demo.repositories.PosicionesRepository;
import hn.unah.lenguajes1900.demo.services.PosicionesService;

@Service
public class PosicionesServiceImpl implements PosicionesService {

    @Autowired
    private PosicionesRepository posicionesRepository;
    @Override
    public List<Posiciones> obtenerTablaPosicion() {
        return (List<Posiciones>) this.posicionesRepository.findAll();
    }
    
}