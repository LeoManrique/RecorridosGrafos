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
    
    public void recorridoAnchura(E nodo_I){
        
        Nodo<E> rA = new Nodo(nodo_I);        
        Cola colaNR = new Cola();
        colaNR.encolar(nodo_I);
        
        while (!colaNR.esVacio()) {
            int r = (int)colaNR.primero();            
            for (int i = 0; i < elementos.length; i++) {                
                if (matriz[r][i]==1 && !rA.isVisitado()) {
                    colaNR.encolar(i);
                    rA.setDato(rA.getDato());
                    rA.setVisitado(true);
                }
            }
            colaNR.desencolar();            
        }
        for (int i = 0; i < elementos.length; i++) {
            System.out.print( elementos[i].getDato()+" ");
        }
        
    /*ArrayList<Integer> recorridoA = new ArrayList<Integer>();
        Nodo_recorrido[nodoI] = true;
        
        ArrayList<Integer> registro_recorridos = new ArrayList<Integer>();
        recorridoA.add(nodoI);
        registro_recorridos.add(nodoI);
        Cola colaA = new Cola();
        while (!registro_recorridos.isEmpty()) {
            int x = registro_recorridos.remove(0); 
            for (int i = 0; i < g_ma.length; i++) {
                if (g_ma[x][i] == 1 && !Nodo_recorrido[i]) {
                    registro_recorridos.add(i);
                    recorridoA.add(i);
                    Nodo_recorrido[i] = true;
                }                   
            }
        }
        return recorridoA; 
    */
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
