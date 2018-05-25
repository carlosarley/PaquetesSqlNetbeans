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
        
        usuario.setIdUsuario(2);
        usuario.setDocumento("1020775856");
        usuario.setNombres("ANDRES");
        usuario.setApellidos("mendez");
        usuario.setTelefono("671731");
        
        
        UsuariosDAOImplementacion udi = new UsuariosDAOImplementacion();
        udi.modificar(usuario);
        
    }
}
