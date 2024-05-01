package hn.unah.lenguajes1900.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.demo.entities.Posiciones;
@Repository
public interface PosicionesRepository extends CrudRepository<Posiciones,Long>{
    boolean existsByEquiposCodigoEquipo(Long codigoEquipo);

    Posiciones findByEquipoCodigoEquipo(long codigoEquipo);
}
