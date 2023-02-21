import java.util.Random;

public class VetorRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumeros = new int[20];


        for (int i = 0; i < randomNumeros.length ; i++) {
            int numero = random.nextInt(100);
            randomNumeros[i] = numero;
        }
        System.out.println("Numeros aleatorios: ");
        for ( int num : randomNumeros ) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Sucessores dos numeros aleatorios: ");
        for ( int num : randomNumeros ) {
            System.out.print((num + 1) + " ");
        }
    }
}
