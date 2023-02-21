package ListaCirculares;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<String>();

        listaCircular.add("c0");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("c1");
        System.out.println(listaCircular);

        listaCircular.add("c2");
        listaCircular.add("c3");
        System.out.println(listaCircular);

        System.out.println(listaCircular.get(0));
        System.out.println(listaCircular.get(1));
        System.out.println(listaCircular.get(2));

        //nao tem c3, então ele vai volta pro loop
        System.out.println(listaCircular.get(3));

        for (int i = 0; i < 20; i++) {
        System.out.println(listaCircular.get(i));
        }

    }
}
