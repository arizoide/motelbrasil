package com.senac.arithomazini.motelbrasil.model;

import javax.persistence.*;

@Entity
@Table
public class Motel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @OneToOne
    private Endereco endereco;

    @Column
    private Double nota;

    @Column
    private String slogan;

    public Motel(int id, String nome, Endereco endereco, Double nota, String slogan) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.nota = nota;
        this.slogan = slogan;
    }

    public Motel(String nome, Endereco endereco, Double nota, String slogan) {
        this.nome = nome;
        this.endereco = endereco;
        this.nota = nota;
        this.slogan = slogan;
    }

    public Motel(String nome, String slogan) {
        this.nome = nome;
        this.slogan = slogan;
    }

    public Motel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
}
