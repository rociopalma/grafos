/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosp2;

import java.util.ArrayList;

/**
 *
 * @author Rocío
 */
public class Nodo {
    private String name;
    private String hability;
    private ArrayList<Arista> adjacents = new ArrayList<>();
 
    public Nodo(String city, String hability ) {
        this.name = name;
        this.hability = hability;
    }
    
   
    public void addArista(Arista arista) {
        adjacents.add(arista);
    }
 
    public ArrayList<Arista> getAdjacents() {
        return adjacents;
    }

    public String getName() {
        return name;
    }

    public String getHability() {
        return hability;
    }
 
   
 
    @Override
    public String toString() {
        return "\nNODO \n[Nombre=" + name + ", \nadjacents=" + adjacents + "]";
    }
}
