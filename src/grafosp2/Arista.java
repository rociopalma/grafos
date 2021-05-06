/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosp2;

/**
 *
 * @author Rocío
 */
public class Arista {
    private Nodo Nombre;
    private Nodo Habilidad;
    private String flecha;
 
    public Arista(Nodo Nombre, Nodo Habilidad, String flecha) {
        this.Nombre = Nombre;
        this.Habilidad = Habilidad;
        this.flecha = flecha;
    }
 

    public Nodo getNombre() {
        return Nombre;
    }

    public void setNombre(Nodo Nombre) {
        this.Nombre = Nombre;
    }

    public Nodo getHabilidad() {
        return Habilidad;
    }

    public void setHabilidad(Nodo Habilidad) {
        this.Habilidad = Habilidad;
    }

    public String getFlecha() {
        return flecha;
    }

    public void setFlecha(String flecha) {
        this.flecha = flecha;
    }

 
    @Override
    public String toString() {
        return "\nARISTA \n[name=" + Nombre.getName() + ", hability=" + Habilidad.getHability() + ", relacion=" + flecha
                + "]";
    }
}
