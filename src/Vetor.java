public class Vetor {
    public static void main(String[] args) {
        int[] vetor = {50,20,150,3,30,95,6};

        System.out.println(vetor);

        int count = 0;
        while(count < (vetor.length) ) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        //invertendo o vetor
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");

        }
    }
}
