import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
         clearScreen();

        Scanner entrada = new Scanner(System.in);

        float count, ate = 10, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0, votosValidos=0;
        int voto = 0;
        float PernctValidos;

        for (count = 1; count <= ate; count++) {
            System.out.print("informe seu Voto --> Candidatos [1, 2, 3 ou 4], nulo 5 ou branco 6: ");
            voto = entrada.nextInt();
            switch (voto) {
                case 1:
                    candidato1++;
                    votosValidos++;
                    break;
                case 2:
                    candidato2++;
                    votosValidos++;
                    break;
                case 3:
                    candidato3++;
                    votosValidos++;
                    break;
                case 4:
                    candidato4++;
                    votosValidos++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    votosValidos++;
                    break;
                default:
                    nulo++;
                    break;
            }
        }
        entrada.close();
        
        PernctValidos = ((float)candidato1/ate) * 100;
        System.out.printf("\nTotal de votos candidato1: %.0f e votos válidos em Porcentagem = %.2f" , candidato1 , (PernctValidos));
        PernctValidos = (candidato2/ate)*100;
        System.out.printf("\nTotal de votos candidato2: %.0f e votos válidos em Porcentagem = %.2f" , candidato2 , (PernctValidos));
        PernctValidos = (candidato3/ate)*100;
        System.out.printf("\nTotal de votos candidato3: %.0f e votos válidos em Porcentagem = %.2f" , candidato3 , (PernctValidos));
        PernctValidos = (candidato4/ate)*100;
        System.out.printf("\nTotal de votos candidato4: %.0f e votos válidos em Porcentagem = %.2f" , candidato4 , (PernctValidos));
        System.out.println("\nTotal de votos Válidos: " + votosValidos);
        System.out.println("Total de votos Nulos: " + nulo);
        System.out.print("Total de votos Brancos: " + branco);
        PernctValidos = ((branco + nulo)/(branco + nulo + votosValidos)) * 100;
        System.out.printf("\nPercentual dos votos brancos e nulos sobre o total de votos válidos = %.2f" , PernctValidos);


    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

