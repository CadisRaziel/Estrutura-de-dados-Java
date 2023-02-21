import java.util.Scanner;

public class LoopsWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exercicio 1
        String nome;
        int idade;


        while (true) {
            System.out.println("nome: ");
            nome = scanner.next();
            if (nome.equals("0")) break;


            System.out.println("idade: ");
            idade = scanner.nextInt();


        }
        System.out.println("saiu do while");


    }

}
