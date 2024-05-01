package hn.unah.lenguajes1900.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.demo.entities.Equipos;
import hn.unah.lenguajes1900.demo.entities.Posiciones;
import hn.unah.lenguajes1900.demo.repositories.EquiposRepository;
import hn.unah.lenguajes1900.demo.repositories.PosicionesRepository;
import hn.unah.lenguajes1900.demo.services.EquiposService;

@Service
public class EquiposServiceImpl implements EquiposService {
    @Autowired
    private EquiposRepository equiposRepository;
    
    @Autowired
    private PosicionesRepository posicionesRepository;
    @Override
    public Equipos crearEquipo(Equipos equipos) {
    Equipos equipos2=this.equiposRepository.save(equipos);
    Posiciones posiciones=equipos2.getPosiciones();
    posiciones.setEquipos(equipos2);
    posicionesRepository.save(posiciones);
    return equipos2;

    }
    @Override
    public String eliminarEquipo(long codigoEquipo) {
        if(posicionesRepository.existsByEquiposCodigoEquipo(codigoEquipo)){
            return "No se puede eliminar el equipo. Hay registros en la tabla de posiciones.";
        }
        equiposRepository.deleteById(codigoEquipo);
        return "Equipo eliminado correctamente";
    }
   
    @Override
    public Equipos buscarEquipo(long codigoEquipo) {
        return this.equiposRepository.findById(codigoEquipo).get();
    }


    
    
}
