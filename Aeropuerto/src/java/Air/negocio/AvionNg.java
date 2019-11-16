
package Air.negocio;

import Air.entidades.AvionEn;
import Air.persistencia.Daos;
import java.sql.Connection;

public class AvionNg {
    
     Daos dao= new Daos();
    
    
    public AvionEn buscarUsuario(Connection c, AvionEn u){
     return dao.buscarAvion(c,u);
    
    }
}
