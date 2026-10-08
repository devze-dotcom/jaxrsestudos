package br.com.estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato c){
        if(c != null){
            contatos.add(c);
        }
    }

    public boolean removerContato(Integer id) {
        return this.contatos.removeIf(c -> c.getId().equals(id));
    }

    public List<Contato> buscarContatoPorNome(String nome){
        return this.contatos.stream()
        .filter(c -> c.getNome().equalsIgnoreCase(nome))
        .collect(Collectors.toList());
    }

    public List<Contato> listarContato(){
        return contatos;
    }
}
