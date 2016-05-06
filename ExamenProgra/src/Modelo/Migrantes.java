/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author User
 */
public class Migrantes extends Persona {
    String statusRefugiado;

    public Migrantes(String id, String lugarProcedencia, String statusRefugiado) {
        super(id, lugarProcedencia);
        this.statusRefugiado = statusRefugiado;
    }
    
    
}
