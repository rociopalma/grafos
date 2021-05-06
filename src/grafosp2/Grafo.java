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
public class Grafo {
    private ArrayList<Nodo> nodos = new ArrayList<>();
 
    public void addNodo(Nodo nodo) {
        nodos.add(nodo);
    }
 
    public ArrayList<Nodo> getNodos() {
        return nodos;
    }
 
    @Override
    public String toString() {
        return "GRAFO \n[nodos =" + nodos + "]";
    }
}
