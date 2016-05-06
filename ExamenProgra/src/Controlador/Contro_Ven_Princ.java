/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ventana_Princ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose Montero
 */
public class Contro_Ven_Princ implements ActionListener {

    
    Ventana_Princ ventanaPrincipal;
    
    public Contro_Ven_Princ(Ventana_Princ ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals(e)){
       
       
       }//Fin if
    }
    
}
