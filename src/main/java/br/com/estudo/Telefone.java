package br.com.estudo;

public class Telefone {
    private String ddd;
    private String numero;
    private TipoTelefone tipo;


    public Telefone(){}

    public Telefone(String ddd, String telefone, TipoTelefone tipo){
        this.ddd = ddd;
        this.numero = telefone;
        this.tipo = tipo;
    }


    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public String getNumeroCompleto() {
        return ddd + numero;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(String telefone) {
        this.numero = telefone;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
