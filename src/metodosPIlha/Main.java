package metodosPIlha;

public class Main {
    public static void main(String[] args) {
        PIlha minhaPIlha = new PIlha();

        minhaPIlha.push(new NoMetodos(1));
        minhaPIlha.push(new NoMetodos(2));
        minhaPIlha.push(new NoMetodos(3));
        minhaPIlha.push(new NoMetodos(4));
        minhaPIlha.push(new NoMetodos(5));
        minhaPIlha.push(new NoMetodos(6));

        System.out.println(minhaPIlha);


        minhaPIlha.pop();
        System.out.println(minhaPIlha);

        minhaPIlha.push(new NoMetodos(99));
        System.out.println(minhaPIlha);
    }
}
