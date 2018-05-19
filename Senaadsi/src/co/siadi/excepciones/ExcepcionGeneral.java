/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.siadi.excepciones;

/**
 *
 * @author SOPORTE
 */
public class ExcepcionGeneral extends RuntimeException{
    public ExcepcionGeneral(){
        this("Ocurrio una excepcion");
    }
    public ExcepcionGeneral(String mensaje){
        super(mensaje);
    }
    
    
}
