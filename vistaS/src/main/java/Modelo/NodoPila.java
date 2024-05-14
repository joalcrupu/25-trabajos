package Modelo;

public class NodoPila {
    private String url;
    NodoPila siguiente;
   
    
    public NodoPila(String url) {
        this.url = url;
        this.siguiente = null;
    }

    public String getUrl() {
        return url;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
  
   
}
