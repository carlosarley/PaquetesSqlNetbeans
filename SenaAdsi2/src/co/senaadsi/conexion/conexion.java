/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.senaadsi.conexion;

      import java.sql.Connection;  
      import java.sql.DriverManager;
      import java.sql.SQLException;        
        

/**
 *
 * @author SOPORTE
 */
public class conexion {
    Connection conectar()throws SQLException{ 
     Connection conexion = null;
     String url = "";
    
     try {
     
      conexion = DriverManager.getConnection(url,"root","123456");
     }catch(SQLException sqle){
         throw sqle;
     }
     
     return conexion;
    }
}
