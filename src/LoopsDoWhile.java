import java.util.Scanner;

public class LoopsDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma= 0;
        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();
            soma += numero;
            System.out.println("Some: " + soma);
            if(numero > maior){
                maior = numero;
            }

            count++;
        } while (count <= 4);

        System.out.println("Maior: " + maior);



        //numeros par e impar
        int quantNumeros;
        int numeros2;
        int quantPares = 0, quantImpares = 0;

        System.out.println("quantidade de numeros: ");
        quantNumeros = scanner.nextInt();

        int counter = 0;

        do{
            System.out.println("Numero: ");
            numeros2 = scanner.nextInt();

            //% 2 -> dividido por dois e pega o resto
            if(numeros2 % 2 == 0){
                quantPares++;
            } else {
                quantImpares++;
            }
            counter++;
        } while (counter < quantNumeros);

        System.out.println("Quantidade par: " + quantPares);
        System.out.println("Quantidade impar: " + quantImpares);
    }
}
