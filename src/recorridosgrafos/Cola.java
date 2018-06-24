package recorridosgrafos;

import java.util.ArrayList;

public class Cola<E> extends ArrayList<E>{
    
    public Cola(){}
    
    public void encolar(E dato){
        this.add(dato);
    }
    
    public void desencolar(){
        if(this.size()>0){
            this.remove(this.get(0));
        }        
    }
    public E ultimo(){
        E ultimo = null;
        if(this.size()>0){
            ultimo = this.get(this.size()-1);
        }        
        return ultimo;
    }
    
    public E primero(){
        E primero = null;
        if(this.size()>0){
            primero = this.get(0);
        }        
        return primero;
    }   
    
    public boolean esVacio(){
        return this.isEmpty();
    }
    
    public Integer tamano(){
        return this.size();
    }    
}