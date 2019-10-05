/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air.negocio;

import Air.entidades.UsuarioEn;
import Air.persistencia.Daos;
import java.sql.Connection;

/**
 *
 * @author salak404
 */
public class UsuarioNg {
    Daos dao= new Daos();
    
    
    public UsuarioEn buscarUsuario(Connection c, UsuarioEn u){
     return dao.buscarUsuario(c,u);
    
    }
}
