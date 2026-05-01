import java.util.Scanner;
public class App {
    public static void exibirNotas(double[] notas){
        System.out.println("--- Notas Cadastradas ---");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do aluno " + (i + 1) + ": " + notas[i]);
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
                maior = notas[i];
            }
        }

        return maior;
    }

    public static double menorNota(double[] notas) {
        double menor = notas[0];

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        return menor;
    }

    public static int contarAprovados(double[] notas) {
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                aprovados++;
            }
        }

        return aprovados;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[5];
        int opcao;
        boolean cadastrado = false;

        do {

            System.out.print("\n=== Sistema de Notas ===\n\n1 - Cadastrar notas\n2 - Exbir notas\n3 - Calcular média\n4 - Maior nota\n5 - Menor nota\n6 - Contar aprovador\n0 - Sair\n");
            System.out.println("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    if (cadastrado == true) {
                        System.out.println("Já cadastrou as notas!");
                    } else {
                        for (int i = 0; i < notas.length; i++) {
                            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                            notas[i] = scanner.nextDouble();
                        }
                        cadastrado = true;
                    }
                    break;

                case 2: 
                    if (cadastrado == false) {
                        System.err.println("Cadastre as notas primeiro!");
                    } else {
                        exibirNotas(notas);
                    }
                    break;

                case 3:
                    if (cadastrado == false) {
                        System.err.println("Cadastre as notas primeiro!");
                    } else {
                        System.out.printf("Média: %.2f", calcularMedia(notas));
                    }
                    break;

                case 4:
                    if (cadastrado == false) {
                        System.err.println("Cadastre as notas primeiro!");
                    } else {
                        System.out.printf("Maior nota: %.2f", maiorNota(notas));
                    }
                    break;

                case 5:
                    if (cadastrado == false) {
                        System.err.println("Cadastre as notas primeiro!");
                    } else {
                        System.out.printf("Menor nota: %.2f", menorNota(notas));
                    }
                    break;

                case 6:
                    if (cadastrado == false) {
                        System.err.println("Cadastre as notas primeiro!");
                    } else {
                        System.out.printf("Aprovados: %d", contarAprovados(notas));
                    }
                    break;

                case 0:
                    break;
            
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        System.out.println("Encerrando. Até logo!");

        scanner.close();
    }
}