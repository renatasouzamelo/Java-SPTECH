package sptech.projeto02;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cantor {

    @JsonIgnore // esta anotação exclui o campo do JSON
    private String senha;
    private int id;
    private String nome;
    private String categoria;
    private Double cache;
    private boolean constaNoSpotify;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Double getCache() {
        return cache;
    }

    public boolean isConstaNoSpotify() {
        return constaNoSpotify;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCache(Double cache) {
        this.cache = cache;
    }

    public void setConstaNoSpotify(boolean constaNoSpotify) {
        this.constaNoSpotify = constaNoSpotify;
    }
}
