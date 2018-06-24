package recorridosgrafos;

import java.util.ArrayList;

public class Cola extends ArrayList{
    
    public Cola(){}
    
    public void encolar(Object dato){
        this.add(dato);
    }
    
    public void desencolar(){
        if(this.size()>0){
            this.remove(this.get(0));
        }        
    }
    public Object ultimo(){
        Object ultimo = null;
        if(this.size()>0){
            ultimo = this.get(this.size()-1);
        }        
        return ultimo;
    }
    
    public Object primero(){
        Object primero = null;
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