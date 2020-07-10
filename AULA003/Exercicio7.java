import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        clearScreen();
        Scanner entrada = new Scanner(System.in);
        int aluno, notas = 0, nota1 = 0, nota2 = 0;
        float mediaGeral = 0;

        for (aluno = 1; aluno <= 5; aluno++) { // 5 alunos
            do {
                System.out.print("Informe a 1º nota do aluno " + aluno + ": ");
                nota1 = entrada.nextInt();
            } while (nota1 < 0 || nota1 > 10);
            do {
                System.out.print("Informe a 2º nota do aluno " + aluno + ": ");
                nota2 = entrada.nextInt();
            } while (nota2 < 0 || nota2 > 10);
            System.out.print("Média do aluno " + aluno + " é: " + (float)(nota1+nota2)/2 );
            System.out.println("\n");
            mediaGeral = mediaGeral + ((float)(nota1+nota2)/2);
        }
        entrada.close();
        System.out.print("média geral da sala: " + (mediaGeral/5) );
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}