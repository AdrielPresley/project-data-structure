package one.dio.model;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz = null;

    public ArvoreBinaria() {
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo(conteudo);
        this.raiz = this.inserir(this.raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else {
            if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
                atual.setNoEsq(this.inserir(atual.getNoEsq(), novoNo));
            } else {
                atual.setNoDir(this.inserir(atual.getNoDir(), novoNo));
            }

            return atual;
        }
    }

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        this.exibirInOrdem(this.raiz);
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            this.exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            this.exibirInOrdem(atual.getNoDir());
        }

    }

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo PosOrdem");
        this.exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            this.exibirPosOrdem(atual.getNoEsq());
            this.exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }

    }

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo PreOrdem");
        this.exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            this.exibirPreOrdem(atual.getNoEsq());
            this.exibirPreOrdem(atual.getNoDir());
        }

    }

    public void remover(T conteudo) {
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo temp = null;

            while(atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
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
                    temp = atual;

                    for(filho = atual.getNoEsq(); filho.getNoDir() != null; filho = filho.getNoEsq()) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(this.raiz.getNoEsq());
                        }

                        temp = filho;
                    }

                    filho.setNoDir(this.raiz.getNoDir());
                    this.raiz = filho;
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
                temp = atual;

                for(filho = atual.getNoEsq(); filho.getNoDir() != null; filho = filho.getNoDir()) {
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

                    temp = filho;
                }
            }
        } catch (NullPointerException var6) {
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }

    }
}
