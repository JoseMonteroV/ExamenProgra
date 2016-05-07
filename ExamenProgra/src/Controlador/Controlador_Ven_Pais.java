/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Array_Paises;
import Modelo.Array_Persona;
import Modelo.Pais;
import Vista.Ventana_Pais;
import Vista.Ventana_Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Plantilla;

/**
 *
 * @author Jose Montero
 */
public class Controlador_Ven_Pais implements ActionListener {

        Ventana_Pais ventanaPais;
        Ventana_Persona ventanaPersona;
        Array_Paises listaPaises;
        Array_Persona listaPersona;
        private Plantilla<Pais> paiz;
        
    public Controlador_Ven_Pais(Ventana_Pais ventana_Pais, Array_Paises listaPaises, Array_Persona lisArrayPersona){
        this.ventanaPais = ventana_Pais;
        this.listaPaises = listaPaises;
        this.listaPersona = lisArrayPersona;
        paiz = new Plantilla<>();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getActionCommand().equals("Agregar")){
            System.out.println("Controlador Pais");
            ventanaPersona.setItemNacimiento();
            
        }//Fin if
    }
    
}
