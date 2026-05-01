import java.util.Scanner;
public class App {
    public static void exibirNotas(double[] notas) {
        System.out.println("--- Notas da Turma ---");
        for (int i = 0; i < notas.length; i++) {
            System.err.printf("Aluno %d: %.1f\n", i + 1, notas[i]);
        }
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma+= notas[i];
        }

        return soma / notas.length;
    }

    public static double maiorNota(double[] notas) {
        double maior = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior += notas[i];
            }            
        }

        return maior;
    }

    public static int contarAprovados(double[] notas) {
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6.0) {
                aprovados++;
            }
        }

        return aprovados;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        exibirNotas(notas);
        double media = calcularMedia(notas);
        double maiorNota = maiorNota(notas);
        int aprovados = contarAprovados(notas);

        System.out.printf("Média da turma: %.2f\n", media);
        System.out.printf("Maior nota: %.2f\n", maiorNota);
        System.out.println("Alunos aprovados: " + aprovados);

        scanner.close();
    }
}