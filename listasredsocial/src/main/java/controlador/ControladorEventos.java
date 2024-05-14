package controlador;

import modelo.Evento;
import modelo.NodoEvento;

import java.time.LocalDateTime;

public class ControladorEventos {

    private NodoEvento inicio;

    public ControladorEventos() {
        this.inicio = null;
    }

    public void agregarEventoPrimero(String tipo, int idUsuario, int año, int mes, int dia, int hora, int minuto, String contenido) {
        Evento nuevoEvento = crearEvento(idUsuario, tipo, año, mes, dia, hora, minuto, contenido);
        NodoEvento nuevoNodo = new NodoEvento(nuevoEvento);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
            inicio = nuevoNodo;
        }
    }

    public void agregarEventoUltimo(String tipo, int idUsuario, int año, int mes, int dia, int hora, int minuto, String contenido) {
        Evento nuevoEvento = crearEvento(idUsuario, tipo, año, mes, dia, hora, minuto, contenido);
        NodoEvento nuevoNodo = new NodoEvento(nuevoEvento);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoEvento temp = inicio;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(temp);
        }
    }

    public void eliminarPrimerEvento() {
        if (inicio != null) {
            inicio = inicio.getSiguiente();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
        }
    }

    public void eliminarUltimoEvento() {
        if (inicio != null) {
            if (inicio.getSiguiente() == null) {
                inicio = null;
            } else {
                NodoEvento temp = inicio;
                while (temp.getSiguiente().getSiguiente() != null) {
                    temp = temp.getSiguiente();
                }
                temp.setSiguiente(null);
            }
        }
    }

    public void modificarEventoPorId(int id, String tipo, int idUsuario, int año, int mes, int dia, int hora, int minuto, String contenido) {
        NodoEvento temp = inicio;
        while (temp != null) {
            if (temp.getEvento().getId() == id) {
                temp.getEvento().setTipo(tipo);
                temp.getEvento().setIdUsuario(idUsuario);
                temp.getEvento().setFechaHora(crearFechaHora(año, mes, dia, hora, minuto));
                temp.getEvento().setContenido(contenido);
                break;
            }
            temp = temp.getSiguiente();
        }
    }

    public NodoEvento getInicio() {
        return inicio;
    }

    public void setInicio(NodoEvento inicio) {
        this.inicio = inicio;
    }

    private Evento crearEvento(int idUsuario, String tipo, int año, int mes, int dia, int hora, int minuto, String contenido) {
        return new Evento(tipo, idUsuario, crearFechaHora(año, mes, dia, hora, minuto), contenido);
    }

    private LocalDateTime crearFechaHora(int año, int mes, int dia, int hora, int minuto) {
        return LocalDateTime.of(año, mes, dia, hora, minuto);
    }

}
