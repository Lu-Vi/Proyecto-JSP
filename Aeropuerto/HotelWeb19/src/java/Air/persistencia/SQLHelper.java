/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air.persistencia;

/**
 *
 * @author docenteitm
 */
public class SQLHelper {
    
    public static String insertHabitacion(){
        return "insert into habitacion(codigo,tipo,valor,capacidad)values(?,?,?,?)";
    }
    public static String selectHabitacion(){
        return "Select codigo, tipo,valor from habitacion where codigo =?";
    }
    
    public static String selectHabitaciones(){
        return "Select codigo, tipo,valor from habitacion";
    }
    public static String selectTipos(){
        return "select codigo, nombre from tipos";
    }
    //trae el perfil de la table usuario donde usuario es un parametro y clave otro si coinsiden los trae si no no
    public static String selectUsuario(){
        return "Select perfil from usuarios where usuario=? and clave=?";
    }
}
