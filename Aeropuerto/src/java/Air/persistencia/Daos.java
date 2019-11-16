
package Air.persistencia;

import Air.entidades.AvionEn;
import Air.entidades.FallasTecnicasEn;
import Air.entidades.PilotoEn;
import Air.entidades.UsuarioEn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Daos {

/**
 * Retorna el valor del perfil del usuario ingresado. Si el usuario no existe retornara 0
 * @param con objeto de conexion a la base de datos
 * @param usuario Objeto de tipo UsuarioEn, que posee los campos usuario y clave
 * @return UsuarioEn Objeto de tipo UsuarioEn, que posee los campos usuario, clave y perfil
 
 */
    
    public UsuarioEn buscarUsuario(Connection con, UsuarioEn usuario){
        usuario.setPerfil(0);
        
        try{
        
        PreparedStatement p=con.prepareStatement(SQLHelper.selectUsuario());
        p.setString(1, usuario.getUsuario());
        p.setString(2, usuario.getClave());
        ResultSet r= p.executeQuery();//resultado de la consulta que tenemos siempre es una tabla 
        if (r.next()){
            usuario.setPerfil(r.getInt(1));//orden de la solumnas donde tenga el set-prima el set
        }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{//lo que quiero que se ejecute con error o sin error
            try{
                con.close();
            }catch(SQLException ex1){
                ex1.printStackTrace();
            } 
        }
        return usuario;
    }
    
    public AvionEn buscarAvion(Connection con, AvionEn matricula){
        
        
        try{
        
        PreparedStatement p=con.prepareStatement(SQLHelper.selectAvion());
        p.setString(1, matricula.toString());
        
        ResultSet r= p.executeQuery();//resultado de la consulta que tenemos siempre es una tabla 
        if (r.next()){
            matricula.setPerfil(r.getInt(1));//orden de la solumnas donde tenga el set-prima el set
        }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{//lo que quiero que se ejecute con error o sin error
            try{
                con.close();
            }catch(SQLException ex1){
                ex1.printStackTrace();
            } 
        }
        return matricula;
    }
    
     public PilotoEn buscarPiloto(Connection con, PilotoEn cedula){
        
        
        try{
        
        PreparedStatement p=con.prepareStatement(SQLHelper.selectAvion());
        p.setString(1, cedula.toString());
        
        ResultSet r= p.executeQuery();//resultado de la consulta que tenemos siempre es una tabla 
        if (r.next()){
            cedula.setPerfil(r.getInt(1));//orden de la solumnas donde tenga el set-prima el set
        }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{//lo que quiero que se ejecute con error o sin error
            try{
                con.close();
            }catch(SQLException ex1){
                ex1.printStackTrace();
            } 
        }
        return cedula;
    }

//       public FallasTecnicasEn buscarFallasTecnica(Connection con, FallasTecnicasEn cedula){
//        
//        
//        try{
//        
//        PreparedStatement p=con.prepareStatement(SQLHelper.selectAvion());
//        p.setString(1, cedula.toString());
//        
//        ResultSet r= p.executeQuery();//resultado de la consulta que tenemos siempre es una tabla 
//        if (r.next()){
//            cedula.setPerfil(r.getInt(1));//orden de la solumnas donde tenga el set-prima el set
//        }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }finally{//lo que quiero que se ejecute con error o sin error
//            try{
//                con.close();
//            }catch(SQLException ex1){
//                ex1.printStackTrace();
//            } 
//        }
//        return cedula;
//    }

}
