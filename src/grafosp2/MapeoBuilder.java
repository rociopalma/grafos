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
public class MapeoBuilder {
    private  Grafo grafo = new Grafo();

    public Grafo getGrafo() {
        Nodo MarioGutierrez = new Nodo("Mario Gutierrez", " ");
        Nodo habilidad1 = new Nodo("Honesto", " ");
        Nodo AnaCifuentes = new Nodo("Ana Cifuentes", " ");
        Nodo habilidad2 = new Nodo("Sabe trabajar en equipo", " ");
        Nodo LindaMendizabal = new Nodo("Linda Mendizabal", " ");
        Nodo habilidad3 = new Nodo("Se comunica bien con los demás", " ");
        Nodo MarielosCobar = new Nodo("Marielos Cóbar", " ");
        Nodo habilidad4 = new Nodo("Responsable", " ");
 
        MarioGutierrez.addArista(new Arista(MarioGutierrez, habilidad1, "tiene"));
        MarioGutierrez.addArista(new Arista(MarioGutierrez, habilidad3, "tiene"));        

        AnaCifuentes.addArista(new Arista(AnaCifuentes, habilidad3, "tiene"));
        AnaCifuentes.addArista(new Arista(AnaCifuentes, habilidad1, "tiene"));
        
        LindaMendizabal.addArista(new Arista(LindaMendizabal, habilidad2, "tiene"));
        LindaMendizabal.addArista(new Arista(LindaMendizabal, habilidad4, "tiene"));

        MarielosCobar.addArista(new Arista(MarielosCobar, habilidad3, "tiene"));
        MarielosCobar.addArista(new Arista(MarielosCobar, habilidad4, "tiene"));
 
        grafo.addNodo(MarioGutierrez);
        grafo.addNodo(AnaCifuentes);
        grafo.addNodo(LindaMendizabal);
        grafo.addNodo(MarielosCobar);
        grafo.addNodo(habilidad1);
        grafo.addNodo(habilidad2);
        grafo.addNodo(habilidad3);
        grafo.addNodo(habilidad4);
        return grafo;
    }
}
