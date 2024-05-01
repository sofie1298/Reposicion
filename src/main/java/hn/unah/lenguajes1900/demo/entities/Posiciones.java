package hn.unah.lenguajes1900.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="posiciones")
@Data
public class Posiciones {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="idposiciones")
private long idPosiciones;


private long empates;


private long ganados;

private long perdidos;

@Column(name="golesfavor")
private long golesFavor;

@Column(name="golescontra")
private long golesContra;


private long puntos;

@JsonIgnore
@OneToOne
@JoinColumn(name = "codigoequipo", referencedColumnName = "codigoequipo")
private Equipos equipos;
}
