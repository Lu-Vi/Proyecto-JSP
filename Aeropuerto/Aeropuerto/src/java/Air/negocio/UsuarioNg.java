package Air.negocio;

import Air.entidades.UsuarioEn;
import Air.persistencia.Daos;
import java.sql.Connection;

public class UsuarioNg {

    Daos dao = new Daos();

    public UsuarioEn buscarUsuario(Connection c, UsuarioEn u) {
        return dao.buscarUsuario(c, u);

    }

    public boolean guardarUsuario(Connection con, UsuarioEn u) {//recibo objetos tipo entidad
        return dao.guardarUsuario(con, u);
    }

    public boolean actualizarUsuario(Connection con, UsuarioEn u) {
        return dao.actualizarUsuario(con, u);
    }


}
