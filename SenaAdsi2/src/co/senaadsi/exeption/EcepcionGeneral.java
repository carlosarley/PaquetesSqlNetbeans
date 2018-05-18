/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.senaadsi.exeption;

/**
 *
 * @author APRENDIZ SENA
 */
public class EcepcionGeneral extends RunTimeException {
    
    public EcepcionGeneral() {
        this("Ocurrio una excepcion");
    }
    
    public EcepcionGeneral (String masaje) {
        super (mensaje);
    }
    
}
