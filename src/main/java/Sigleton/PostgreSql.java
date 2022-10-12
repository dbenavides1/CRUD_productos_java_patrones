
package Sigleton;

import Interface.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSql implements Conexion{
    private static PostgreSql connection;
    private String driver;
    private String user;
    private String password;

    private PostgreSql() {
        driver="jdbc:postgresql://localhost:5432/java_productos";
        user="postgres";
        password="pgdavid1";
    }
    public static PostgreSql getInstance(){
        if(connection==null){
            connection=new PostgreSql();
        }
        return connection;
    }
    
    @Override
    public Connection Conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(driver, user, password);
            System.out.println("Conexion con exitosa postgresSQL");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }   
}
