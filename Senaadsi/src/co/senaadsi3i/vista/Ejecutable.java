/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.senaadsi3i.vista;

import co.siadi.DAO.UsuariosDAOImplementacion;
import co.siadi.modelo.Usuario;

/**
 *
 * @author SOPORTE
 */
public class Ejecutable {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        usuario.setIdUsuario(1);
        usuario.setDocumento("1031180251");
        usuario.setNombres("SANTIAGO");
        usuario.setApellidos("MOLANO");
        usuario.setTelefono("3727055");
        
        UsuariosDAOImplementacion udi = new UsuariosDAOImplementacion();
        udi.insertar(usuario);
        
    }
}
