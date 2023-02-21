package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack -> Pilha(vai colocando um em cima do outro, ou seja o ultimo que chega é o primeiro, mais tambem é o primeiro a sair)
        Stack<Carros> stackCarros = new Stack<Carros>();


        //push -> pilha
        stackCarros.push(new Carros("Ford"));
        stackCarros.push(new Carros("Chevrolet"));
        stackCarros.push(new Carros("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);


        //peek -> ele mostra,mais não retira
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        //empty -> testa se a lista ta vazia
        System.out.println(stackCarros.empty());
        System.out.println(stackCarros);
    }
}
