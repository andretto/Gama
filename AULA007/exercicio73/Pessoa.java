package exercicio73;

public class Pessoa {
    private String nome;
    private String tipoDeSenhaN_P;
    private int senha=0;

    public Pessoa(String nome, String tipoDeSenhaN_P, int senha) {
        this.nome = nome;
    this.tipoDeSenhaN_P = tipoDeSenhaN_P;
        this.senha = senha;
    }
    public void setTipoDeSenhaN_P(String tipoDeSenhaN_P ){
            this.tipoDeSenhaN_P= tipoDeSenhaN_P;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

/*     public void setSenha(int senha) {
        senha ++;
        this.senha = senha;
    } */

    

    


    
}