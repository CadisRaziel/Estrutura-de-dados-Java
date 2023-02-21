package EqualsAndHashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carros> listaCarro = new ArrayList<>();
        listaCarro.add(new Carros("Ford"));
        listaCarro.add(new Carros("Chevrolet"));
        listaCarro.add(new Carros("Volksvagen"));

        System.out.println(listaCarro.contains(new Carros("Ford")));
        System.out.println((new Carros("Ford").hashCode()));
        System.out.println((new Carros("Ford").hashCode()));



        Carros carros1 = new Carros("Ford");
        Carros carros2 = new Carros("Chevrolet");

        //como esta com nomes diferentes, vai ser diferente, mais se colocar-mos nomes iguais, eles ficam com o mesmo hashCode
        System.out.println(carros1.equals(carros2));
    }
}
