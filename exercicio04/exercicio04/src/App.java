import java.util.Scanner;
public class App {
    public static int contarPares(int[] numeros) {
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
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

        int numerosPares = contarPares(numeros);

        System.out.print("Quantidade de pares: " + numerosPares);

        scanner.close();
    }
}