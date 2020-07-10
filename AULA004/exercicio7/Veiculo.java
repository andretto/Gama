package exercicio7;

public class Veiculo {
    // atributos
    String modelo, marca;
    int consumo;

    // metodo construtor
    Veiculo(String modelo, String marca, int consumo) {
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    // metodo

    String exibirModeloMarca(){
    return ("Modelo: " + modelo + " - Marca: " + marca );
    }

    String exibirConsumo(){
        return ("Consumo: " + consumo);
        }
    

}