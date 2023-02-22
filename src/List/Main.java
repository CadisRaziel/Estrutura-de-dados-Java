package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       List<Carros> listCarros = new ArrayList<Carros>();


       listCarros.add(new Carros("c1"));
       listCarros.add(new Carros("c2"));
       listCarros.add(new Carros("c3"));
       listCarros.add(new Carros("c4"));

        System.out.println(listCarros.contains(new Carros("c1")));

        //get -> pega pelo indice
        System.out.println(listCarros.get(2));


        //indexOf -> mostra o indice que ta o elemento
        System.out.println(listCarros.indexOf(new Carros("c3")));

        //remove -> remove pelo indice
        System.out.println(listCarros.remove(2));

    }
}
