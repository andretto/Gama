package exercicio03;

public class Animal {
    private String nomeAnimal,raca,cor,ano;
    private Proprietario proprietario;

    public Animal(String nomeAnimal, String raca, String cor, String ano, String nomeProprietario, String telefone){
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.cor = cor;
        this.ano = ano;
        proprietario = new Proprietario(nomeProprietario, telefone);
    }

    //public void setProprietario (String nomeProprietario, String telefone){
//        proprietario = new Proprietario(nomeProprietario, telefone);
//    }



    public String exibir(){
        return nomeAnimal + " - " + raca + " - " + cor + " - " + ano + " - " + proprietario.exibir();
        
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getProprietario() {
        return proprietario.getNomeProprietario();
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }



    
}