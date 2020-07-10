package sample0.sample1;

public class Livro {
    //atributos
    String titulo, autor;
    int numPaginas;
    
    //metodos

    //metodos construtor
    Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }




    String exibir(){
        return (titulo + ": "+ autor + ": " + numPaginas);
    }



    
    
}