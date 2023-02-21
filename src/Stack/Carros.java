package Stack;

import java.util.Objects;

public class Carros {
    //Devem ser implementados juntos
    //Equals -> Comparação de igualade
    //hashCode -> melhora a busca de objetos

    private String marcaCarro;

    public Carros(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    @Override
    //se eu quiser saber se um carro é igual o outro pela marca, eu uso o equals (verifica a referencia de memoria, porém como vamos pegar o nome, ele vai comparar só o nome)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carros that = (Carros) o;
        return Objects.equals(marcaCarro, that.marcaCarro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marcaCarro);
    }

    public String getMarcaCarro() {
        return marcaCarro;
    }

    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "marcaCarro='" + marcaCarro + '\'' +
                '}';
    }
}
