package fila;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                //aqui vamo corre de nó em nó ate achar o primeiro
                if(primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        //caso estiver vazia retorna nulo
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila; // vamos manter em -1
            while (true){
                //aqui vamo corre de nó em nó ate achar o primeiro
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        //caso estiver vazia retorna nulo
        return null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;
        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{Objeto=" + noAuxiliar.getObject() + "}] -->";
                if(noAuxiliar.getRefNo() != null){
                noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "Null";
                    break;
                }
            }
        }else {
            stringRetorno = null;
        }

        return stringRetorno;
    }
}
