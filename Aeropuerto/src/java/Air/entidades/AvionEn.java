
package Air.entidades;


public class AvionEn {
    
    private String marca;
    private String nitAerolinea;
    private String nombreAerolinea;
    private String hangar;
    private int perfil;

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNitAerolinea() {
        return nitAerolinea;
    }

    public void setNitAerolinea(String nitAerolinea) {
        this.nitAerolinea = nitAerolinea;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getHangar() {
        return hangar;
    }

    public void setHangar(String hangar) {
        this.hangar = hangar;
    }
    
}
