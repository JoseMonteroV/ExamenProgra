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
public class Pais {
    @Anotacion
    int capacidadPersonas, solicitudesRefugio;
    @Anotacion
    String nombre;
     @Anotacion(guardar_xml = false)
    private static String[] etiquetas = {"Capacidad de Personas", "Solicitudes de Refugio", "Nombre"};

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getSolicitudesRefugio() {
        return solicitudesRefugio;
    }

    public void setSolicitudesRefugio(int solicitudesRefugio) {
        this.solicitudesRefugio = solicitudesRefugio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}//
