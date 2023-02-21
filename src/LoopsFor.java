import java.util.Scanner;

public class LoopsFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Tabuada: ");
        int tabuada = scanner.nextInt();


        System.out.println("Tabuada: " + tabuada);

        for (int i = 0; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }


        //fatorial
        //5! = 120 (5! = 5x4x3x2x1)

        System.out.println("Fatorial: ");
        int fatorial = scanner.nextInt();

        int multiplcacao = 1;

        System.out.println(fatorial +"! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplcacao *= i;
        }

        System.out.println(multiplcacao);
    }


}
