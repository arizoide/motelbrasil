package com.senac.arithomazini.motelbrasil.model;

public class Endereco {

    private int id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String unidadeFederativa;
    private String cep;
    private String complemento;
    private String pontoReferencia;

    public Endereco(int id, String rua, String bairro, String cidade, String estado, String unidadeFederativa, String cep, String complemento, String pontoReferencia) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.unidadeFederativa = unidadeFederativa;
        this.cep = cep;
        this.complemento = complemento;
        this.pontoReferencia = pontoReferencia;
    }

    public Endereco(String rua, String bairro, String cidade, String estado, String unidadeFederativa, String cep, String complemento, String pontoReferencia) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.unidadeFederativa = unidadeFederativa;
        this.cep = cep;
        this.complemento = complemento;
        this.pontoReferencia = pontoReferencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }
}
