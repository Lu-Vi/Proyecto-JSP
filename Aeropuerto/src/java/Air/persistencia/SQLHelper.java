
package Air.persistencia;

public class SQLHelper {
    
    public static String selectUsuario(){
        return "Select perfil from usuarios where usuario=? and clave=?";
    }
    
     public static String selectAvion(){
        return "";
    }
     
      public static String selectPiloto(){
        return "";
    }
      
       public static String selectFallaTecnica(){
        return "";
    }
}
