/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import Interface.Conexion;
import Sigleton.MySql;
import Sigleton.PostgreSql;

/**
 *
 * @author Bairon-Dajome
 */
public class ConexionFactory {
    public static Conexion Motor(String motor){
        switch(motor){
            case "mysql":return MySql.getInstance();
            case "postgresql":return PostgreSql.getInstance();
            default: return null;
        }
    }
}
