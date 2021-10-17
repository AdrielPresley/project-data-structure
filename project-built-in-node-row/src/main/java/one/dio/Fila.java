package one.dio;

public class Fila {
    private No refNoEntradaFila = null;

    public Fila() {
    }

    public void enqueue(Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(this.refNoEntradaFila);
        this.refNoEntradaFila = novoNo;
    }

    public Object dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            No primeiroNo = this.refNoEntradaFila;

            No noAuxiliar;
            for(noAuxiliar = this.refNoEntradaFila; primeiroNo.getRefNo() != null; primeiroNo = primeiroNo.getRefNo()) {
                noAuxiliar = primeiroNo;
            }

            noAuxiliar.setRefNo((No)null);
            return primeiroNo.getObject();
        }
    }

    public Object first() {
        if (this.isEmpty()) {
            return null;
        } else {
            No primeiroNo;
            for(primeiroNo = this.refNoEntradaFila; primeiroNo.getRefNo() != null; primeiroNo = primeiroNo.getRefNo()) {
            }

            return primeiroNo.getObject();
        }
    }

    public boolean isEmpty() {
        return this.refNoEntradaFila == null;
    }

    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = this.refNoEntradaFila;
        if (this.refNoEntradaFila == null) {
            stringRetorno = "null";
        } else {
            while(true) {
                stringRetorno = stringRetorno + "[No{dado=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() == null) {
                    stringRetorno = stringRetorno + "null";
                    break;
                }

                noAuxiliar = noAuxiliar.getRefNo();
            }
        }

        return stringRetorno;
    }
}
