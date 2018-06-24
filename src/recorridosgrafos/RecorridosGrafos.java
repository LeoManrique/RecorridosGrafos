package recorridosgrafos;

public class RecorridosGrafos {

    public static void main(String[] args) {
        Nodo[] lista = new Nodo[3];
        lista[0] = new Nodo("A");
        lista[1] = new Nodo("B");
        lista[2] = new Nodo("C");
        
        Grafo grafo = new Grafo(lista);
        
        grafo.añadirVertice(0, 1);
        grafo.añadirVertice(0, 2);
        grafo.añadirVertice(2, 1);
        grafo.añadirVertice(1, 0);
        
        System.out.println(grafo.toString());
        
        grafo.recorridoProfundidad(0);
    }
}
