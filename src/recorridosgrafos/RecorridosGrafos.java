package recorridosgrafos;

public class RecorridosGrafos {

    public static void main(String[] args) {
        Nodo[] lista = new Nodo[11];
        lista[0] = new Nodo("A");
        lista[1] = new Nodo("B");
        lista[2] = new Nodo("C");
        lista[3] = new Nodo("D");
        lista[4] = new Nodo("E");
        lista[5] = new Nodo("F");
        lista[6] = new Nodo("G");
        lista[7] = new Nodo("H");
        lista[8] = new Nodo("I");
        lista[9] = new Nodo("J");
        lista[10] = new Nodo("K");
                
        Grafo grafo = new Grafo(lista);
<<<<<<< HEAD

=======
        
        System.out.println(grafo.toStringElementos());

        grafo.añadirVertice(0, 1);
        grafo.añadirVertice(0, 2);
        grafo.añadirVertice(2, 1);
        grafo.añadirVertice(1, 0);
        
        System.out.println(grafo.toString());
        
        grafo.recorridoProfundidad(0);

        //System.out.println(grafo.toStringElementos());

        
>>>>>>> b66c6ebb7e3f37db28bfab57a3fbb751b88ee6b5
        grafo.añadirVertice(0, 1);
        grafo.añadirVertice(1, 0);
        grafo.añadirVertice(1, 4);
        grafo.añadirVertice(4, 1);
        grafo.añadirVertice(4, 8);
        grafo.añadirVertice(8, 4);
        grafo.añadirVertice(8, 5);
        grafo.añadirVertice(5, 8);
        grafo.añadirVertice(0, 2);
        grafo.añadirVertice(2, 0);
        grafo.añadirVertice(2, 6);
        grafo.añadirVertice(6, 2);
        grafo.añadirVertice(6, 9);
        grafo.añadirVertice(9, 6);
        grafo.añadirVertice(9, 10);
        grafo.añadirVertice(10, 9);
        grafo.añadirVertice(10, 7);
        grafo.añadirVertice(7, 10);
        grafo.añadirVertice(7, 3);
        grafo.añadirVertice(3, 7);
        
        System.out.println(grafo.toString());
        
        grafo.recorridoProfundidad(0);
        
<<<<<<< HEAD
        //grafo.recorridoAnchura(0);
=======
        grafo.recorridoAnchura(0);

>>>>>>> b66c6ebb7e3f37db28bfab57a3fbb751b88ee6b5
    }
}
