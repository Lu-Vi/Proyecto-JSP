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
import Air.entidades.HabitacionEn;
import Air.entidades.TiposEn;
import Air.entidades.UsuarioEn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//un dao por cada tabla

public class Daos {

    public boolean guardarHabitacion(Connection c, HabitacionEn h) {
        boolean resultado = true;
        try {
            String sql = SQLHelper.insertHabitacion();
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, h.getNumero());
            p.setString(2, h.getTipo());
            p.setDouble(3, h.getPrecio());
            p.setInt(4, h.getCapacidad());
            p.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        } finally {
            try {
                c.close();
            } catch (Exception clo) {
            }

        }
        return resultado;
    }
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

//      
//     
//     public List<HabitacionEn>getHabitaciones(Connection con){          
//            List<HabitacionEn> result = new ArrayList<HabitacionEn>();
//            try{
//                PreparedStatement p = con.prepareStatement(SQLHelper.selectHabitaciones());
//                ResultSet r = p.executeQuery();
//                    while(r.next()){
//                        HabitacionEn c = new HabitacionEn();
//                        c.setNumero(r.getInt(1));
//                        c.setTipo(r.getString(2));
//                        c.setPrecio(r.getInt(3));
//                        result.add(c);
//                    }
//                } catch(Exception ex){
//                    ex.printStackTrace();
//                }finally{
//                try{
//                  con.close();
//                }catch(Exception clo){}
//
//                }
//            return result;
//            
//	}
//    
//     public List<TiposEn>getTipos(Connection con){          
//            List<TiposEn> result = new ArrayList<TiposEn>();
//            try{
//                PreparedStatement p = con.prepareStatement(SQLHelper.selectTipos());
//                ResultSet r = p.executeQuery();
//                    while(r.next()){
//                        TiposEn c = new TiposEn();
//                        c.setCodigo(r.getInt(1));
//                        c.setNombre(r.getString(2));
//                        result.add(c);
//                    }
//                } catch(Exception ex){
//                    ex.printStackTrace();
//                }finally{
//                try{
//                  con.close();
//                }catch(Exception clo){}
//
//                }
//            return result;
//            
//	}
//    

}