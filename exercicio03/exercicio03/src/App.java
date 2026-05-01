import java.util.Scanner;
public class App {
    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite os números: ");
            numeros[i] = scanner.nextInt();
        }

        int maior = encontrarMaior(numeros);

        System.out.print("O maior é: " + maior);

        scanner.close();
    }
}
