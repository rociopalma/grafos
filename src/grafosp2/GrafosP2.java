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
public class GrafosP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        (new GrafosP2()).init();
    }
    
    private void init() {
        MapeoBuilder mapeoBuilder = new MapeoBuilder();
        Grafo grafo = mapeoBuilder.getGrafo();
        System.out.println(grafo);
    }
    
}
