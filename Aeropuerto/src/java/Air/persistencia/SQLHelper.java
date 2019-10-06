
package Air.persistencia;

public class SQLHelper {
    
    public static String selectUsuario(){
        return "Select perfil from usuarios where usuario=? and clave=?";
    }
}
