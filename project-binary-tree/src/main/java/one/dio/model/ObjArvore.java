package one.dio.model;

public abstract class ObjArvore<T> implements Comparable<T> {
    public ObjArvore() {
    }

    public abstract boolean equals(Object var1);

    public abstract int hashCode();

    public abstract int compareTo(T var1);

    public abstract String toString();
}
