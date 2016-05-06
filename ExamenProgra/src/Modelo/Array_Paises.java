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
public class Array_Paises {
    private ArrayList <Pais> arrayPais;
    int pos;

    public Array_Paises() {
        arrayPais = new ArrayList<>();
    }
    
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    public Pais getInfo(){
         return arrayPais.get(getPos());
     }
    
    public void agregarCurso(Pais pais){
        arrayPais.add(pais);
    }// agrega un curso
    
     public boolean buscarCursoPorSigla(String nombre){
       boolean buscar=false;
        for(int i=0; i<arrayPais.size(); i++ )
            if(arrayPais!=null){
                if(arrayPais.get(i).getNombre().equalsIgnoreCase(nombre))
                {
                    buscar=true;
                    setPos(i);
                    break;
                }
            }
        return buscar;
    }//busca y retorna el curso
}
