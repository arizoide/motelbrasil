package com.senac.arithomazini.motelbrasil.model;

public class Quarto {

    private int id;
    private String nome;
    private String tipoCama;
    private boolean hidro;
    private boolean arcondicionado;
    private boolean suite;
    private boolean piscina;
    private String descricao;
    private Double valorHora; //valor considerado por hora
    private Double valorPernoite;
    private int periodoMinimo;
    private Motel motel;

    public Quarto(String nome, String tipoCama, boolean hidro, boolean arcondicionado, boolean suite, boolean piscina, String descricao, Double valorHora, Double valorPernoite, int periodoMinimo, Motel motel) {
        this.nome = nome;
        this.tipoCama = tipoCama;
        this.hidro = hidro;
        this.arcondicionado = arcondicionado;
        this.suite = suite;
        this.piscina = piscina;
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.valorPernoite = valorPernoite;
        this.periodoMinimo = periodoMinimo;
        this.motel = motel;
    }

    public Quarto(int id, String nome, String tipoCama, boolean hidro, boolean arcondicionado, boolean suite, boolean piscina, String descricao, Double valorHora, Double valorPernoite, int periodoMinimo, Motel motel) {
        this.id = id;
        this.nome = nome;
        this.tipoCama = tipoCama;
        this.hidro = hidro;
        this.arcondicionado = arcondicionado;
        this.suite = suite;
        this.piscina = piscina;
        this.descricao = descricao;
        this.valorHora = valorHora;
        this.valorPernoite = valorPernoite;
        this.periodoMinimo = periodoMinimo;
        this.motel = motel;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public boolean isHidro() {
        return hidro;
    }

    public void setHidro(boolean hidro) {
        this.hidro = hidro;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isSuite() {
        return suite;
    }

    public void setSuite(boolean suite) {
        this.suite = suite;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorPernoite() {
        return valorPernoite;
    }

    public void setValorPernoite(Double valorPernoite) {
        this.valorPernoite = valorPernoite;
    }

    public int getPeriodoMinimo() {
        return periodoMinimo;
    }

    public void setPeriodoMinimo(int periodoMinimo) {
        this.periodoMinimo = periodoMinimo;
    }

    public Motel getMotel() {
        return motel;
    }

    public void setMotel(Motel motel) {
        this.motel = motel;
    }
}
