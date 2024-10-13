package com.frutas.frutas.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "frutas") // Especificamos el nombre exacto de la tabla
@Data
@NoArgsConstructor
public class Fruits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Asumimos que el campo id es autoincremental
    @Column(name = "id") // Mapea la columna 'id' de la tabla
    private Integer id;  // Cambiado a Integer ya que el tipo SQL es 'int'

    @Column(name = "nombre", nullable = false) // Mapea la columna 'nombre' de la tabla
    private String nombre;  // Cambiado a String ya que el tipo SQL es 'nvarchar'
}