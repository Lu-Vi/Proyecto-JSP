/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air.entidades;


public class PilotoEn {
    
    private String cedula;
    private String nombre;
    private String añoGraduacion;
    private String horaInicioVuelo;
    private String horaFinVuelo;
    private String tipoPiloto;
    private int perfil;

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAñoGraduacion() {
        return añoGraduacion;
    }

    public void setAñoGraduacion(String añoGraduacion) {
        this.añoGraduacion = añoGraduacion;
    }

    public String getHoraInicioVuelo() {
        return horaInicioVuelo;
    }

    public void setHoraInicioVuelo(String horaInicioVuelo) {
        this.horaInicioVuelo = horaInicioVuelo;
    }

    public String getHoraFinVuelo() {
        return horaFinVuelo;
    }

    public void setHoraFinVuelo(String horaFinVuelo) {
        this.horaFinVuelo = horaFinVuelo;
    }

    public String getTipoPiloto() {
        return tipoPiloto;
    }

    public void setTipoPiloto(String tipoPiloto) {
        this.tipoPiloto = tipoPiloto;
    }

    
    
}
