package com.Bodega.entity;

import javax.persistence.*;

@Entity
@Table(name = "departamento")
public class Departamento {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)-----Esto es para tablas con autoincremento
    @Column(name = "ID")
    private Integer id;

    @Column(name = "m2")
    private double m2;

    @Column(name = "precio")
    private double precio;

    //constructor
    public Departamento() {
    }

    public Departamento(Integer id, double m2, double precio) {
        this.id = id;
        this.m2 = m2;
        this.precio = precio;
    }

    //Getter Setter

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString()

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", m2=" + m2 +
                ", precio=" + precio +
                '}';
    }
}
