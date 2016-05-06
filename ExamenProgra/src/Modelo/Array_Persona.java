/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Jose Montero
 */
public class Array_Persona {
    private ArrayList <Persona> arrayPersona;
    int pos;

    public Array_Persona() {
        arrayPersona = new ArrayList<>();
    }
    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    public Persona getInfo(){
         return arrayPersona.get(getPos());
     }
    
    public void agregarCurso(Persona persona){
        arrayPersona.add(persona);
    }// agrega un curso
    
     public boolean buscarCursoPorSigla(String identificacion){
       boolean buscar=false;
        for(int i=0; i<arrayPersona.size(); i++ )
            if(arrayPersona!=null){
                if(arrayPersona.get(i).getId().equalsIgnoreCase(identificacion))
                {
                    buscar=true;
                    setPos(i);
                    break;
                }
            }
        return buscar;
    }//busca y retorna el curso
}
