package exercicio03;



public class AppProprietarioAnimal {
    public static void main(String[] args) {

        GerenciaCadastro gerenciaCadastro = new GerenciaCadastro();
        gerenciaCadastro.addAnimal("Bidu", "Vira lata", "branco", "2010", "Marcelo Andretto", "1122555");
        gerenciaCadastro.addAnimal("Ze", "poodle", "branco", "2011", "Edna Andretto", "665655");
        gerenciaCadastro.addAnimal("Snoop", "Vira lata", "marrom", "2017", "Eduardo Andretto", "55851245");
        gerenciaCadastro.addAnimal("Boob", "poodle", "marrom", "2018", "Edna  Andretto", "2132342");

        
        System.out.println(gerenciaCadastro.listaTodos());
        System.out.println("\n");
        System.out.println(gerenciaCadastro.listaRaca("poodle") );

        System.out.println("\n");
        System.out.println(gerenciaCadastro.listaRaca("Vira lata") );


        
        
    }
    

    
    


}