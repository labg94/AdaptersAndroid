package com.example.luisa.pruebaadapter.modelo;

public class Alarma {
    String hora, estado;

    public Alarma(String hora, String estado) {
        this.hora = hora;
        this.estado = estado;
    }

    public Alarma() {
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
