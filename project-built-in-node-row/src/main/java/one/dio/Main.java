package one.dio;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        minhaFila.enqueue(1);
        minhaFila.enqueue("segundo");
        minhaFila.enqueue(3);
        minhaFila.enqueue("quarto");
        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
    }
}
