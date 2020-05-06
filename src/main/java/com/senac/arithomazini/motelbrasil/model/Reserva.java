package com.senac.arithomazini.motelbrasil.model;

import javax.persistence.ManyToOne;

public class Reserva {

    private int id;
    private Quarto quarto;
    private Cliente cliente;
    private double periodoUtilizado; //em minutos

    public Reserva(Quarto quarto, Cliente cliente, double periodoUtilizado) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.periodoUtilizado = periodoUtilizado;
    }

    public Reserva(int id, Quarto quarto, Cliente cliente, double periodoUtilizado) {
        this.id = id;
        this.quarto = quarto;
        this.cliente = cliente;
        this.periodoUtilizado = periodoUtilizado;
    }

    public int getId() {
        return id;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPeriodoUtilizado() {
        return periodoUtilizado;
    }

    public void setPeriodoUtilizado(double periodoUtilizado) {
        this.periodoUtilizado = periodoUtilizado;
    }
}
