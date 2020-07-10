package exercicios;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);

        Double salarioMinimo, qtdeKwhConsumida, valorDeUmDoKhW, valorReaisDoKhWASerPago, valorReaisDoKhWASerPagoCom15PercentDesconto;
        // porcentagemKwh;

        System.out.print("\nInforme o Valor do Salário Mínimo: ");
        salarioMinimo = entrada.nextDouble();

        System.out.print("\nInforme a quantidade de KhW consumido: ");
        qtdeKwhConsumida = entrada.nextDouble();
        //porcentagemKwh = ( 1.0 / 500);
        valorDeUmDoKhW = (salarioMinimo / 500);

        System.out.print("\nO valor, em reais, de cada quilowatt é R$ " + valorDeUmDoKhW);
        valorReaisDoKhWASerPago = valorDeUmDoKhW * qtdeKwhConsumida;

        System.out.print("\nO valor, em reais, a ser pago por essa residência será de R$ "+ valorReaisDoKhWASerPago );
        valorReaisDoKhWASerPagoCom15PercentDesconto = valorReaisDoKhWASerPago * 0.85;

        System.out.print("\nO valor, em reais, a ser pago com desconto de 15%, será de R$ " + valorReaisDoKhWASerPagoCom15PercentDesconto);
        entrada.close();

    }
 
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
       }


}