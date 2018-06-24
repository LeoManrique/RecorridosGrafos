package ejercicio_p2_pila;

import java.util.ArrayList;

public class Pila extends ArrayList{
    
    public Pila(){}
    
    public void apilar(Object dato){
        this.add(dato);
    }
    
    public void desapilar(){
        if(this.size()>0){
            this.remove(this.size()-1);
        }
    }
    
    public Object tope(){
        Object aux = null;
        if(this.size()>0){
            aux = this.get(this.size()-1);
        }
        return aux;
    }
    
    public boolean EsVacio(){
        return this.isEmpty();
    }
    
    public Integer Tamano(){
        return this.size();
    }
    public boolean Buscar(Object dato){
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
