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
public class Plantilla<T> {
    private ArrayList<T> arreglo;

    public Plantilla() {
        arreglo=new ArrayList<T>();
    }

    
    public void agregar(T t){
         arreglo.add(t);
         System.out.println(t.getClass());
     }

   



}
