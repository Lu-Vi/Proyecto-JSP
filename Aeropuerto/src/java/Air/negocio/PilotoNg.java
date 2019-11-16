
package Air.negocio;

import Air.entidades.PilotoEn;
import Air.persistencia.Daos;
import java.sql.Connection;


public class PilotoNg {
      Daos dao= new Daos();
    
    
    public PilotoEn buscarUsuario(Connection c, PilotoEn u){
     return dao.buscarPiloto(c,u);
    
    }
}
