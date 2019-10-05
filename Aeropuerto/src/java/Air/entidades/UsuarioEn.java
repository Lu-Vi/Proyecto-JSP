/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air.entidades;

/**
 *
 * @author salak404
 */
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
