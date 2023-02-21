package No;

public class UsandoNo {
    public static void main(String[] args) {
        EntendendoNo no1 = new EntendendoNo("conteudo no1");
        EntendendoNo no2 = new EntendendoNo("conteudo no2");

        //fazr a referencia do no1 apontar pro no2
        no1.setProximoNo(no2);

        EntendendoNo no3 = new EntendendoNo("conteudo no3");
        no2.setProximoNo(no3);

        EntendendoNo no4 = new EntendendoNo("conteudo no4");
        no3.setProximoNo(no4);


        //null -> temrino o encadeamento
        //no1 apontando no2 apontando no3 apontando no4 apontando null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
