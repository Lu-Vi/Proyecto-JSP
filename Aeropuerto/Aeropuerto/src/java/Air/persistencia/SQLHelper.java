
package Air.persistencia;

public class SQLHelper {
    
    public static String selectUsuario(){
        return "Select perfil from logueo where nombre=? and clave=?";
    }
    public static String guardarUsuario(){
        //String nom, String ape, String ced, String tel, int edad, String dir, String numLice, String a1, String a2, String b1, String b2, String b3, String c1, String c2, String c3, Date fecha, String tipo, String tarjCredito) {
 
        return "insert into ClienteEn (nom,  ape,  ced, tel,  edad,  dir, numLice,  a1,  a2,  b1, b2,  b3,  c1, c2,  c3,  fecha1, fecha2, fecha3,  tipo, tarjCredito ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
