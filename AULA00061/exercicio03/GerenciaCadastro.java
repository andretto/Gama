package exercicio03;
import java.util.ArrayList;

public class GerenciaCadastro {
    private ArrayList<Animal> arrayAnimal;

    public GerenciaCadastro(){
        arrayAnimal = new ArrayList<>();
    }

    public void addAnimal (String nomeAnimal, String raca, String cor, String ano, String nomeProprietario, String telefone){
        Animal animal = new Animal(nomeAnimal, raca, cor, ano, nomeProprietario, telefone);
        arrayAnimal.add(animal);
    }

    public String listaTodos(){
        String saida ="";
        for (Animal animal : arrayAnimal) {
            saida += animal.exibir() +"\n";
        }
        return saida;
    }

    public String listaRaca(String raca){
        String saida ="";
        for (Animal animal : arrayAnimal) {
            if (animal.getRaca().equals(raca)) {
                saida += animal.getProprietario() +"\n";
                
            }
            
        }
        
        return saida;
    }
    
    
}