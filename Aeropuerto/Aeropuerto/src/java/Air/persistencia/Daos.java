package Air.persistencia;

import Air.entidades.TiposEn;
import Air.entidades.UsuarioEn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Daos {

    /**
     * Retorna el valor del perfil del usuario ingresado. Si el usuario no
     * existe retornara 0
     *
     * @param con objeto de conexion a la base de datos
     * @param usuario Objeto de tipo UsuarioEn, que posee los campos usuario y
     * clave
     * @return UsuarioEn Objeto de tipo UsuarioEn, que posee los campos usuario,
     * clave y perfil
     *
     */
    public UsuarioEn buscarUsuario(Connection con, UsuarioEn usuario) {
        usuario.setPerfil(0);
        try {
            PreparedStatement p = con.prepareStatement(SQLHelper.selectUsuario());
            p.setString(1, usuario.getUsuario());
            p.setString(2, usuario.getClave());
            ResultSet r = p.executeQuery();
            if (r.next()) {
                usuario.setPerfil(r.getInt(1));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex1) {
                ex1.printStackTrace();
            }
        }

        return usuario;
    }

    public boolean guardarUsuario(Connection con, UsuarioEn lec) {
        boolean resultado = true;
        try {
            String sql = SQLHelper.guardarUsuario();
            lec.setPerfil(0);
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(2, lec.getUsuario());
            p.setString(3, lec.getClave());
            p.setString(4, lec.getCorreo());
       

            p.execute();// tanbien puede usar executeUpdate (este retorna el numero de filas afectadas)

        } catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        } finally {
            try {
                con.close();
            } catch (Exception clo) {
            }
        }
        return resultado;

    }

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
