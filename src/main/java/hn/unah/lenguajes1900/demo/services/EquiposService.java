package hn.unah.lenguajes1900.demo.services;

import hn.unah.lenguajes1900.demo.entities.Equipos;

public interface EquiposService {
    
 public Equipos crearEquipo(Equipos equipos);
 public String eliminarEquipo(long codigoEquipo);
 public Equipos buscarEquipo(long codigoEquipo);

}
