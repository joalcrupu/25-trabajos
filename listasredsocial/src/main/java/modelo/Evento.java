package modelo;

import java.time.LocalDateTime;

public class Evento {

    private static int contadorIds = 0;

    private int id;
    private String tipo;
    private int idUsuario;
    private LocalDateTime fechaHora;
    private String contenido;

    public Evento(String tipo, int idUsuario, LocalDateTime fechaHora, String contenido) {
        this.id = id;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
        this.fechaHora = fechaHora;
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
