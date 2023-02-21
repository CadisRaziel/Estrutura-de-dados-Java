package metodosPIlha;

public class PIlha {
    private NoMetodos refNoEntradaPilha;

    public PIlha() {
        this.refNoEntradaPilha = null;
    }

    public void push(NoMetodos novoNo){
        NoMetodos refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setNo(refAuxiliar);
    }

    public  NoMetodos pop(){
        if(!isEmpty()){
            NoMetodos noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getNo();
        }
        return null;
    }


    public NoMetodos top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }


    @Override
    public String toString() {
        String stringRetonro = "---------------\n";
        stringRetonro += "      Pilha\n";
        stringRetonro += "---------------\n";

        NoMetodos noAuxiliar = refNoEntradaPilha;

        while (true) {
            if(noAuxiliar != null){
                stringRetonro += "[NoMetodo{dado=" + + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getNo();
            } else {
                break;
            }
        }
        stringRetonro += "===========\n";
        return stringRetonro;
    }
}
