package com.Bodega.entity;

import javax.persistence.*;

@Entity
@Table(name = "articulos")
public class Articulos {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Cod_Barras")
    private String codBarras;

    @Column(name = "Precio")
    private double precio;

    @Column(name = "Existencia")
    private int existencia;

    //Constructor
    public Articulos() {
    }

    public Articulos(Integer id, String nombre, String codBarras, double precio, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codBarras = codBarras;
        this.precio = precio;
        this.existencia = existencia;
    }

    //Getter y Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    //toString()

    @Override
    public String toString() {
        return "Articulos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", codBarras='" + codBarras + '\'' +
                ", precio=" + precio +
                ", existencia=" + existencia +
                '}';
    }
}
