package br.com.estudo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContato {
    
    private List<Contato> contatos = new ArrayList<>();

    public List<Contato> listarContatos(){
        return contatos;
    }
    
    public Contato buscarContato(String nome){
        for(Contato contato: contatos){
            if(contato.getNome().equals(nome))
                return contato;
        }
        return null;
    }

    public boolean adcionarContato(Contato contato){
        return contatos.add(contato);
    }

    public boolean removerContato(String nome){
        for(Contato contato: contatos){
            if(contato.getNome().equals(nome))
                return contatos.remove(contato);
        }
        return false;
    }
}
