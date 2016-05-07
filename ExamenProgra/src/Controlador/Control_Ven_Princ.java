/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Array_Paises;
import Modelo.Array_Persona;
import Modelo.Ciudadano;
import Modelo.Indigenas;
import Modelo.Migrantes;
import Modelo.Pais;
import Modelo.Persona;
import Vista.Ventana_Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose Montero
 */
public class Control_Ven_Princ implements ActionListener {

    
    Ventana_Persona ventanaPrincipal;
    Persona persona;
    Ciudadano ciudadano;
    Indigenas indigenas;
    Migrantes migrantes;
    Pais pais;
    Array_Paises listaPaises;
    Array_Persona listaPersona;
   
    public Control_Ven_Princ(Ventana_Persona ventanaPrincipal, Array_Paises listaPaises, Array_Persona listaPersona){
        this.ventanaPrincipal = ventanaPrincipal;

        this.listaPaises = listaPaises;
        this.listaPersona = listaPersona;
    

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("Agregar")){
       
             switch(ventanaPrincipal.getRadioButton()){
             
                 case 1:
                     // ciudadano = new Ciudadano(ventanaPrincipal.getTextId(), ventanaPrincipal.getTextLugar());
                         break;
                 case 2:
                     // indigenas = new Indigenas(ventanaPrincipal.getTextId(),ventanaPrincipal.getTextLugar());
                      System.out.print("Agregado correctamente, indigena");
                         break;
                 case 3: 
                      //migrantes = new Migrantes(ventanaPrincipal, , );
                     break;
                     
                 case 4:
                     break;
             }//Fin switch
             
        System.out.println("Click en Agregar");
       }//if
         
       
       }//Fin Action
    
    }//Fin clase
    

