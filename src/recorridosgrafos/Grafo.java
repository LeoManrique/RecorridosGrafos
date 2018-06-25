package recorridosgrafos;

import java.util.ArrayList;

public class Grafo<E> {
    Nodo<E>[] elementos;
    int[][] matriz;

    public Grafo(Nodo<E>[] elementos) {
        this.elementos = elementos;
        int cantidad = elementos.length;
        this.matriz = new int[cantidad][cantidad];
        for (int i = 0; i < cantidad; i++) {
            for ( int j = 0; j < cantidad; j++){
                matriz[i][j]=0;
            }
        }
    }

    public void añadirVertice(int pos1, int pos2){
        matriz[pos1][pos2] = 1;
    }
    public void eliminarVertice(int pos1, int pos2){
        matriz[pos1][pos2] = 0;
    }
    
    public void recorridoAnchura(Integer nodo_I){
        
        int cantidad = elementos.length,r;
        ArrayList<E> salida = new ArrayList<>();
        Nodo<E> nodo = elementos[nodo_I];
        nodo.setVisitado(true);
        Cola<Integer> recorrido = new Cola();        
        recorrido.encolar(nodo_I);
        salida.add(nodo.getDato());
        
        while (!recorrido.esVacio()) {
            r = recorrido.primero();            
            for (int i = 0; i < cantidad; i++) {                
                if (matriz[r][i] == 1 && !elementos[i].isVisitado()) {
                    //nodo_I = i;
                    nodo = elementos[i];
                    nodo.setVisitado(true);
                    recorrido.encolar(i);
                    salida.add(nodo.getDato());
                }
            }
            recorrido.desencolar(); 
        }
        System.out.println("Grafo recorrido en anchura: "+salida);
    }
    public void recorridoProfundidad(Integer nodoI){
        int cantidad = elementos.length;
        ArrayList<E> output = new ArrayList<>();
        Nodo<E> nodo = elementos[nodoI];
        nodo.setVisitado(true);
        Pila<Integer> recorrido = new Pila();
        recorrido.apilar(nodoI);
        output.add(nodo.getDato());
        
        while(!recorrido.esVacio()){
            boolean ultimo = true;
            for (int i = 0; i < cantidad; i++){
                if (matriz[nodoI][i] == 1 && !elementos[i].isVisitado()){
                    nodoI = i;
                    nodo = elementos[i];
                    nodo.setVisitado(true);
                    recorrido.apilar(nodoI);
                    output.add(nodo.getDato());
                    ultimo = false;
                    break;
                }
            }
            if (ultimo){
                recorrido.desapilar();
                nodoI = recorrido.tope();
            }
        }
        System.out.println("Grafo recorrido en profundidad: "+output);
    }
    
    public String toStringElementos(){
        int cantidad = elementos.length;
        String res = "Listado de Elementos: \n";
        for (int i = 0; i < cantidad; i++) {
            res+= "Elemento "+i+": "+elementos[i].getDato()+"\n";
        }
        res+="\n";
        return res;
    }
    public String toStringMatriz(){
        int cantidad = elementos.length;
        String res= "Matriz de adyacencia: \n";
        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                res+= matriz[i][j]+"  ";
            }
            res+="\n";
        }
        return res;
    }
    
    @Override
    public String toString(){
        String res = toStringElementos()+toStringMatriz();
        return res;
    }
}
