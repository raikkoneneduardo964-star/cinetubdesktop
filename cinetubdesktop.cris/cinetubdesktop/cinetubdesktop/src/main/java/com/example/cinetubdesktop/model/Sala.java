package com.example.cinetubdesktop.model;

public class Sala {

    private Long id;
    private String nome;
    private int capacidade;
    private String tipoTela;


    public Sala() {
    }


    public Sala(Long id, String nome, int capacidade, String tipoTela) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.tipoTela = tipoTela;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public String toString() {
        return nome;
    }
}