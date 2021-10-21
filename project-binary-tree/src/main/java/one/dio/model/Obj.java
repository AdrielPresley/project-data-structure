package one.dio.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Obj obj = (Obj)o;
            return Objects.equals(this.meuValor, obj.meuValor);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.meuValor});
    }

    public int compareTo(Obj outro) {
        int i = 0;
        if (this.meuValor > outro.meuValor) {
            i = 1;
        } else if (this.meuValor < outro.meuValor) {
            i = -1;
        }

        return i;
    }

    public String toString() {
        return this.meuValor.toString();
    }
}
