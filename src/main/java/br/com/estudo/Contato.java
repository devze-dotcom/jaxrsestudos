package br.com.estudo;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    private Integer id;
    private String nome;
    private String sobrenome;
    private String email;
    private List<Telefone> telefones;
    
    public Contato(){}

    public Contato(Integer id, String nome, String sobrenome, String email){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefones = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }


}
