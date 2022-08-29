package com.example.projetogrifes;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Grife {
    private String nome;
    private Integer anoCriacao;
    private Double valorAcaoBolsa;
    @JsonIgnore
    private String chaveAcesso;


    public String getNome() {
        return nome;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }

    public Double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoCriacao(Integer anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public void setValorAcaoBolsa(Double valorAcaoBolsa) {
        this.valorAcaoBolsa = valorAcaoBolsa;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }
}
