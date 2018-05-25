/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.siadi.DAO;


import co.siadi.excepciones.ExcepcionGeneral;
import co.siadi.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author SOPORTE
 */
public class UsuariosDAOImplementacion implements UsuariosDAO {

    private final String INSERTAR = "INSERT INTO Ususarios (idUsusarios, documento, nombres, apellidos, telefono) VALUES (?, ?, ?, ?, ?)";
    private final String MODIFICAR = "UPDATE Ususarios set documento = ?, nombres = ?, apellidos = ?, telefono = ? WHERE idUsusarios = ?";
    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultado;

    /**
     *
     * @param o
     */
    @Override
    public void insertar(Usuario o) {
     try{
        conexion = new conexion().conectar();
        sentencia = conexion.prepareStatement(INSERTAR, Statement.RETURN_GENERATED_KEYS);
        sentencia.setInt(1, o.getIdUsuario()); 
        sentencia.setString(2, o.getDocumento());
        sentencia.setString(3, o.getNombres());
        sentencia.setString(4, o.getApellidos());
        sentencia.setString(5, o.getTelefono());
        if (sentencia.executeUpdate()==0){
            throw  new ExcepcionGeneral("no se inserto ningun registro");
        }
        resultado = sentencia.getGeneratedKeys();
        if (resultado.next())
        {
            o.setIdUsuario(resultado.getInt(1));
        }
     } catch (SQLException sqle)
     {
         throw new ExcepcionGeneral (sqle.getMessage());
     }
     finally {
         cerrarConexiones();
     }
    }

    @Override
    public void modificar(Usuario o) {
        
        try {
        conexion = new conexion().conectar();
        sentencia = conexion.prepareStatement(MODIFICAR);
         
        sentencia.setString(1, o.getDocumento());
        sentencia.setString(2, o.getNombres());
        sentencia.setString(3, o.getApellidos());
        sentencia.setString(4, o.getTelefono());
        sentencia.setInt(5, o.getIdUsuario());
        if (sentencia.executeUpdate()==0){
            throw  new ExcepcionGeneral("no se modifico ningun registro");
        }        
     } catch (SQLException sqle)
     {
         throw new ExcepcionGeneral (sqle.getMessage());
     }
     finally {
         cerrarConexiones();
     }
    }           
                           
        
     
    @Override
    public void eliminar(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario obtenerPorId(Integer k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> Listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    private void cerrarConexiones() {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
            
        }
        catch (SQLException sqle)
                    {
                    
                    }
    }
}
