import java.util.Scanner;
public class App {
    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return (double) soma / numeros.length;
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

        double media = calcularMedia(numeros);

        System.out.printf("A média é: %.2f", media);

        scanner.close();
    }
}
