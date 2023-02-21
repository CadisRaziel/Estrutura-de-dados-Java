package metodosPIlha;

public class NoMetodos {
    private int dado;
    private NoMetodos no;

    public NoMetodos(int dado) {
        this.dado = dado;
    }

    public NoMetodos() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoMetodos getNo() {
        return no;
    }

    public void setNo(NoMetodos no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "NoMetodos{" +
                "dado=" + dado +
                '}';
    }
}
