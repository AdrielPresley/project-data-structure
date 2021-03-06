package one.dio;

public class No<T> {
    private T object;
    private No refNo = null;

    public No() {
    }

    public No(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public String toString() {
        return "No{dado=" + this.object + "}";
    }
}
