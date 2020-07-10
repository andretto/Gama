import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        clearScreen();

        Scanner entrada = new Scanner(System.in);
        int qtdeAlunosVetor;
        float mediaTurma = 0;

        // int[] valores, numeros; // ambos são vetores
        // int valores1[], numeros1; // valores1 é vetor e numeros1 é int
        int[] notas;
        System.out.print("\nInforme a quantidade de Alunos: ");
        qtdeAlunosVetor = entrada.nextInt();
        notas = new int[qtdeAlunosVetor];
        int qtdeNotasAcimaDaMedia = 0;

        // Entrada das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("\ndigite o " + (i + 1) + "o. numero: ");
            notas[i] = entrada.nextInt();
        }
        entrada.close();
        // Motra todas as notas e soma as notas para calcular a média.
        System.out.print("Motrando todas as Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
            mediaTurma = mediaTurma + notas[i];
        }
        System.out.print("\nTam do Vetos: " + notas.length);
        mediaTurma = (mediaTurma / notas.length);
        System.out.print("\nMédia da Turma: " + mediaTurma);

        //Mostra a quantidade de notas acima da média
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > mediaTurma) {
                qtdeNotasAcimaDaMedia = qtdeNotasAcimaDaMedia + 1;
            }
        }
        System.out.print("\nQtde de Notas acima da média: " + qtdeNotasAcimaDaMedia);
        //fim
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}