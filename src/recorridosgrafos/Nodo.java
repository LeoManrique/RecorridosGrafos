package recorridosgrafos;

public class Nodo<E> {
    private E dato;
    private boolean visitado;

    public Nodo(E dato) {
        this.dato = dato;
        this.visitado = false;
    }
    
    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }
    
    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    
}
