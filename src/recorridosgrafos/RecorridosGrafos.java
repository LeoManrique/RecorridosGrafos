package recorridosgrafos;

public class RecorridosGrafos {

    public static void main(String[] args) {
        Nodo<Integer>[] lista = new Nodo[3];
        lista[0] = new Nodo(0);
        lista[1] = new Nodo(1);
        lista[2] = new Nodo(2);
        
        Grafo grafo = new Grafo(lista);
        
        System.out.println(grafo.toString());
        
        grafo.añadirVertice(0, 2);
        
        System.out.println(grafo.toStringMatriz());
    }
}
