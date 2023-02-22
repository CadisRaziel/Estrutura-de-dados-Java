package Set;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
      //set -> conjunto

        Set<Carros> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carros("c1"));
        hashSetCarros.add(new Carros("c2"));
        hashSetCarros.add(new Carros("c3"));
        hashSetCarros.add(new Carros("c4"));
        hashSetCarros.add(new Carros("c5"));

        //o hashSet imprime em ordem aleatoria, diferente de uma lista
        System.out.println(hashSetCarros);


        //precisa que a classe carros implementa a classe Comparable
        Set<Carros> treeSetCarros = new TreeSet<Carros>();

        //o treeSet imprime na ordem
        System.out.println(treeSetCarros);


        treeSetCarros.add(new Carros("f1"));
        treeSetCarros.add(new Carros("f2"));
        treeSetCarros.add(new Carros("f3"));
        treeSetCarros.add(new Carros("f4"));
        treeSetCarros.add(new Carros("f5"));

    }
}
