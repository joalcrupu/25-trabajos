package modelo;

public class NodoEvento {

    private Evento evento;
    private NodoEvento anterior;
    private NodoEvento siguiente;

    public NodoEvento(Evento evento) {
        this.evento = evento;
        this.anterior = null;
        this.siguiente = null;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public NodoEvento getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoEvento anterior) {
        this.anterior = anterior;
    }

    public NodoEvento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEvento siguiente) {
        this.siguiente = siguiente;
    }
}
