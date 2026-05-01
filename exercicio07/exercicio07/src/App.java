import java.util.Scanner;
public class App {
    public static void exibirPrecos(double[] precos) {
        System.out.print("\n--- Produtos Cadastrados ---\n");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + precos[i]);
        }
    }

    public static double calcularMedia(double[] precos) {
        double soma = 0;
        
        for (int i = 0; i < precos.length; i++) {
            soma += precos[i];
        }

        return (double) soma / precos.length;
    }

    public static double maiorPreco(double[] precos) {
        double maior = precos[0];

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > maior) {
                maior = precos[i];
            }
        }

        return maior;
    }

    public static double menorPreco(double[] precos) {
        double menor = precos[0];

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] < menor) {
                menor = precos[i];
            }
        }

        return menor;
    }

    public static int produtosAcima50(double[] precos) {
        int produtos50 = 0;

        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > 50) {
                produtos50++;
            }
        }

        return produtos50;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double[] precos = new double[5];

        System.out.print("=== Sistema de Produtos ===\n\n");        
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = scanner.nextDouble();
        }

        exibirPrecos(precos);
        double media = calcularMedia(precos);
        double maior = maiorPreco(precos);
        double menor = menorPreco(precos);
        int acima50 = produtosAcima50(precos);

        System.out.printf("\nMédia dos preços: %.1f\n", media);
        System.out.printf("Produto mais caro: %.1f\n", maior);
        System.out.printf("Produto mais barato: %.1f\n", menor);
        System.out.printf("Produtos acima de R$ 50: %d", acima50);

        scanner.close();
    }
}