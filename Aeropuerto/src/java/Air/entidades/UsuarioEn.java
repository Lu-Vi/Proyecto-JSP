
package Air.entidades;


public class UsuarioEn {

    private String usuario;
    private String clave;
    private int perfil;

    //para que busque usuario y clave, si es mayor que 1 o encontro
    public UsuarioEn(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
   
    
    
    
    
}
