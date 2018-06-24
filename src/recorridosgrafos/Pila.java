package recorridosgrafos;

import java.util.ArrayList;

public class Pila<E> extends ArrayList<E>{
    
    public Pila(){}
    
    public void apilar(E dato){
        this.add(dato);
    }
    
    public void desapilar(){
        if(this.size()>0){
            this.remove(this.size()-1);
        }
    }
    
    public E tope(){
        E aux = null;
        if(this.size()>0){
            aux = this.get(this.size()-1);
        }
        return aux;
    }
    
    public boolean esVacio(){
        return this.isEmpty();
    }
    
    public Integer getTamano(){
        return this.size();
    }
    public boolean buscar(E dato){
        boolean encontrado = false;
        int i=0;
        while(i<this.size() && !encontrado){
            if(this.get(i)==dato){
                encontrado = true;
            }else{
                i++;
            }            
        }        
        return encontrado;
    }
}
