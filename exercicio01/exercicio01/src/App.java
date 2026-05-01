public class App {
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 20, 30, 40, 50};

        imprimirArray(numeros);
    }
}
