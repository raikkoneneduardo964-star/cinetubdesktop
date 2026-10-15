package com.example.cinetubdesktop.model;

import java.time.LocalDateTime;

public class Sessao {

    private Long id;
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private int duracaoFilme;
    private Sala sala;
    private Filme filme;


    public Sessao() {
    }


    public Sessao(Long id, LocalDateTime inicio, LocalDateTime fim, int duracaoFilme, Sala sala, Filme filme) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.duracaoFilme = duracaoFilme;
        this.sala = sala;
        this.filme = filme;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        String nomeFilme = (filme != null) ? filme.getTitulo() : "Sem filme";
        String nomeSala = (sala != null) ? sala.getNome() : "Sem sala";
        return nomeFilme + " - " + nomeSala + " (" + inicio + ")";
    }
}



