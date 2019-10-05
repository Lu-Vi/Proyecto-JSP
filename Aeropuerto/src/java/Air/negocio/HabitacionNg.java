/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Air.negocio;

import Air.utilidades.Conexion;
import Air.persistencia.Daos;
import Air.entidades.HabitacionEn;
/**
 *
 * @author docenteitm
 */
public class HabitacionNg {
    
    /** Permite vericar los datos para almacenar una habitación, 
     * @param HabitacionEn Ibjeto de tipo habitacion entidad con los datos de la habitacion a almacenar
     * @return  valido si almacena  retornara 0,
     * si el tiepo de habitacion es incorrecto, retornara 1, si la habitacion esta repetida 
     * retornara 2
     */
     Daos dao=new Daos();
    Conexion c=new Conexion();
    public HabitacionNg(){
        
    }
    
//    public int guardarHabitacion(HabitacionEn h){
//    if(dao.guardarHabitacion(c.getCon(), h)){
//        return 0;
//    }
//    else{
//        return 2;
//        
//    }
//    }
    
//    public HabitacionEn buscarHabitacion(int codigo){
//     HabitacionEn h=dao.buscarHabitacion(c.getCon(), codigo);
//     return h;
//    
    
//    }

    }
    
    

