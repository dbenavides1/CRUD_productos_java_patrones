/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sigleton;

import Interface.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bairon-Dajome
 */
public class MySql implements Conexion{
    private static MySql connection;
    private String driver; 
    private String user;
    private String password;

    private MySql() {
        driver="jdbc:mysql://localhost:3306/java_productos";
        user="root";
        password="";
    }
    public static MySql getInstance(){
        if(connection==null){
            connection=new MySql();
        }
        return connection;
    }

    @Override
    public Connection Conectar() {
       Connection conn = null;
        try {
            conn = DriverManager.getConnection(driver, user, password);
            System.out.println("Conexion con exito MySql");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
}
