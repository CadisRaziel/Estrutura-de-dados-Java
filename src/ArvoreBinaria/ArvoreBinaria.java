package ArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) { //se a arvore tive vazia eu retorno um novoNo
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) { //compareTo => é do implements Comparable
            //se o conteudo do no que eu to passando é menor que o no atual
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<T>(conteudo);

        //metodo incursivo, vai chamar a classe privada inserir
        raiz = inserir(raiz, novoNo); //raiz(atual), novoNo(novoNo)
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirInOrdem() {
        System.out.println("\n exibindo InOrdem");
        exibirInOrdem(this.raiz);
    }


    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ",");
        }
    }

    public void exibirPosOrdem() {
        System.out.println("\n exibindo posOrdem");
        exibirPosOrdem(this.raiz);
    }


    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

    public void exibirPreOrdem() {
        System.out.println("\n exibindo preOrdem");
        exibirPreOrdem(this.raiz);
    }


    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    //se for menor vai pra esquerda
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            } else if (atual.getNoDir() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                } else {
                    pai.setNoDir(atual.getNoEsq());
                }
            } else if (atual.getNoEsq() == null) {
                if (pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                } else {
                    pai.setNoDir(atual.getNoDir());
                }
            } else {
                for (
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho.getNoDir()) {
                    if (filho != atual.getNoEsq()) {
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual) {
                        pai.setNoEsq(filho);
                    } else {
                        pai.setNoDir(filho);
                    }
                }
            }

        } catch (NullPointerException erro) {
            System.out.println("Conteudo nao encontrado. Bloco catch");
        }
    }

}
