package one.dio;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Fila<Integer> minhaFila = new Fila();
        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);
        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(99);
        System.out.println(minhaFila);
    }
}
