/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air.entidades;

/**
 *
 * @author docenteitm
 */
public class HabitacionEn {
    //precio
    public HabitacionEn(String tipo, String numero, int capacidad,double precio){
        this.tipo=tipo;
        this.numero=numero;
        this.capacidad=capacidad;
        this.precio=precio;
    }
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    private String tipo;
    private String numero;
    private int capacidad;
    private double precio;
}
