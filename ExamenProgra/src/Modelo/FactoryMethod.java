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
public class FactoryMethod {
    private Persona instaciaPersona;
        
    public Persona getPersona(String nombre, String id, String lugarProcedencia, String statusRefugiado){
        switch(nombre){
            case "Ciudadano":
                instaciaPersona=new Ciudadano(id, lugarProcedencia);
             break;
            case "Indigena":
                instaciaPersona= new Indigenas(id, lugarProcedencia);
                break;
            case "Migrante":
                instaciaPersona= new Migrantes(id, lugarProcedencia, statusRefugiado);
                break;
            case "Refugiado":
            instaciaPersona= new Refugiados(id, lugarProcedencia);
            break;
        }
        return instaciaPersona;
    }
}
