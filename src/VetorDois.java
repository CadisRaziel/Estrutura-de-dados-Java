import java.util.Scanner;

public class VetorDois {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantConsoantes = 0;

        int counter = 0;
        do {
            System.out.println("Letra : ");
            String letra = in.next();

            //equalsIgnoreCase -> compara a string "a" e compara com a letra (tanto maiuscula quanto minuscula)
            if( !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[counter] = letra;
                quantConsoantes++;
            }
            counter++;
        } while (counter < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoantinha : consoantes ) {
            if(consoantinha != null) {

            System.out.print(consoantinha + " ");
            }
        }
    }
}
