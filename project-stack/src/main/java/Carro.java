import java.util.Objects;

public class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof Carro)) {
            return false;
        } else {
            Carro carro = (Carro)o;
            return Objects.equals(this.getMarca(), carro.getMarca());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getMarca()});
    }

    public String toString() {
        return "Carro{marca='" + this.marca + "'}";
    }
}