
package Air.negocio;

import Air.entidades.UsuarioEn;
import Air.persistencia.Daos;
import java.sql.Connection;


public class UsuarioNg {
    Daos dao= new Daos();
    
    
    public UsuarioEn buscarUsuario(Connection c, UsuarioEn u){
     return dao.buscarUsuario(c,u);
    
    }
}
