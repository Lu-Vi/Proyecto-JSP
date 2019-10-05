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
    
    public static String selectUsuario(){
        return "Select perfil from usuarios where usuario=? and clave=?";
    }
}
