package exercicio03;

public class Proprietario {
    private String nomeProprietario, telefone;

    // Construtos;
    public Proprietario() {
    }

    public Proprietario(String nome, String telefone) {
        this.nomeProprietario = nome;
        this.telefone = telefone;
    }

    public String exibir() {
        return nomeProprietario + " - " + telefone;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }


    
}