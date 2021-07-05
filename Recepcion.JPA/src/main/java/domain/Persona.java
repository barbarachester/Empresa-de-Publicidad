package domain;

import javax.persistence.*;

@Entity
public class Persona {
 @Id
 
 private String rut;
 private String nombre;
 private String apelllido;
 private int edad;
 private String empresa;
 private String estado;
 private String región;
 public Persona(){
 }
 

    public Persona(String rut, String nombre, String apelllido, int edad, String empresa, String estado, String región) {
        this.rut = rut;
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.edad = edad;
        this.empresa = empresa;
        this.estado = estado;
        this.región = región ;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegion() {
        return región;
    }

    public void setRegion(String región) {
        this.región = región;
    }

    @Override
    public String toString() {
        return "Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apelllido=" + apelllido + ", edad=" + edad + ", empresa=" + empresa + ", estado=" + estado + ", región=" + región + '}';
    }

    
    }








