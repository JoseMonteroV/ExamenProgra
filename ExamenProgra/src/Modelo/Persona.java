/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jose Montero
 */
public class Persona {
    
    String id, lugarProcedencia;

    
//    public Persona(){
//    
//    }
    
    public Persona(String id, String lugarProcedencia) {
        this.id = id;
        this.lugarProcedencia = lugarProcedencia;
    }//
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLugarProcedencia() {
        return lugarProcedencia;
    }

    public void setLugarProcedencia(String lugarProcedencia) {
        this.lugarProcedencia = lugarProcedencia;
    }
    
    
    
   
    
}
