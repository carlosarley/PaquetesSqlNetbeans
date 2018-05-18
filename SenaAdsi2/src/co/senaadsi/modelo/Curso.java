/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.senaadsi.modelo;

/**
 *
 * @author SOPORTE
 */
public class Curso {
    private int idCurso;
    private String descripcion;
    private double precio;
    
    
    public Curso (){
}

    //contructor
    public Curso(int idCurso, String descripcion, double precio) {
        this.idCurso = idCurso;
        this.descripcion = descripcion;
        this.precio = precio;
    }
   
    // GET Y SET
    public int getIdCurso() {
        return idCurso;
    }

    // toString 
    
    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
