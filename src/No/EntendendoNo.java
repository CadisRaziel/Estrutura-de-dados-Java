package No;

public class EntendendoNo {
   private String conteudo;
   private EntendendoNo proximoNo;

    public EntendendoNo(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public EntendendoNo getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(EntendendoNo proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "EntendendoNo{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
