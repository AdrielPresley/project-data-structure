package one.dio;

public class Fila<T> {
    private No refNoEntradaFila = null;

    public Fila() {
    }

    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(this.refNoEntradaFila);
        this.refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            No primeiroNo = this.refNoEntradaFila;

            No noAuxiliar;
            for(noAuxiliar = this.refNoEntradaFila; primeiroNo.getRefNo() != null; primeiroNo = primeiroNo.getRefNo()) {
                noAuxiliar = primeiroNo;
            }

            noAuxiliar.setRefNo(null);
            return (T) primeiroNo.getObject();
        }
    }

    public T first() {
        if (this.isEmpty()) {
            return null;
        } else {
            No primeiroNo;
            for(primeiroNo = this.refNoEntradaFila; primeiroNo.getRefNo() != null; primeiroNo = primeiroNo.getRefNo()) {
            }

            return (T) primeiroNo.getObject();
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
