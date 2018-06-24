package recorridosgrafos;

public class RecorridosGrafos {

    public static void main(String[] args) {
        Nodo[] lista = new Nodo[3];
        lista[0] = new Nodo("A");
        lista[1] = new Nodo("B");
        lista[2] = new Nodo("C");
        
        Grafo grafo = new Grafo(lista);
        
        System.out.println(grafo.toString());
        
        grafo.añadirVertice(0, 2);
        
        System.out.println(grafo.toStringMatriz());
    }
}
