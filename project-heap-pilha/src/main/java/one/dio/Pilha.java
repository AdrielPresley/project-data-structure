package one.dio;

public class Pilha {
    No refNoEntradaPilha = null;

    public Pilha() {
    }

    public void push(No novoNo) {
        No refAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = novoNo;
        this.refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = this.refNoEntradaPilha;
            this.refNoEntradaPilha = this.refNoEntradaPilha.getRefNo();
            return noPoped;
        } else {
            return null;
        }
    }

    public No top() {
        return this.refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return this.refNoEntradaPilha == null;
    }

    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno = stringRetorno + "   Pilha\n";
        stringRetorno = stringRetorno + "------------\n";

        for(No noAuxiliar = this.refNoEntradaPilha; noAuxiliar != null; noAuxiliar = noAuxiliar.getRefNo()) {
            stringRetorno = stringRetorno + "[No{dado=" + noAuxiliar.getDado() + "}]\n";
        }

        stringRetorno = stringRetorno + "============";
        return stringRetorno;
    }
}
