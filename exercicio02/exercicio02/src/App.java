import java.util.Scanner;
public class App {
    public static int somarArray(int[] numeros) {
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int tamanho = scanner.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite os números: ");
            numeros[i] = scanner.nextInt();
        }

        int soma = somarArray(numeros);

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
