/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.siadi.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SOPORTE
 */
public class conexion {

    Connection conectar() throws SQLException {
        Connection conexion = null;
        String url = "jdbc:mysql://localhost/mydb";
        try {
            conexion = DriverManager.getConnection(url, "root" ,"");
        } catch (SQLException sqle) {
            throw sqle;
        }
        return conexion;
    }
}
