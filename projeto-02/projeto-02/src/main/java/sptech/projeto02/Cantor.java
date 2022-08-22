package sptech.projeto02;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Cantor {

    @JsonIgnore   // está anotação exclui/ignorar campo senha
    private String senha;
    private Integer id;
    private String nome;
    private String categoria;
    private Integer cache;
    private boolean constaNoSpotify;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public Integer getCache() {
        return cache;
    }

    public boolean isConstaNoSpotify() {
        return constaNoSpotify;
    }


    public String getSenha() {
        return senha;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
