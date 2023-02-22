package QueueFilas;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carros> queueCarros = new LinkedList<Carros>();
        
        queueCarros.add(new Carros("Ford"));
        queueCarros.add(new Carros("Chevrolet"));
        queueCarros.add(new Carros("Fiat"));

        //retorna true ou false se consegui adiciona ou nao
        System.out.println(queueCarros.add(new Carros("pegeout")));


        System.out.println(queueCarros);

        //offer -> retorna falso se nao consegui executar(parecido com o add, a diferença é que add da um erro)
        System.out.println(queueCarros.offer(new Carros("renault")));
        System.out.println(queueCarros);


        //peek -> pega primeiro carro da fila mais nao remove, e se nao tive nenhum ele retona null
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //poll -> pega o primeiro e remove
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        //para verificar se ta vazia
        System.out.println(queueCarros.isEmpty());

        //para ver o tamanho
        System.out.println(queueCarros.size());
    }
}
