package domain.estados;

public abstract class Nueva implements Estado {
    public double precioFinal(double precioBase) {
        return precioBase;
    }

    public Nueva() {
    }
}
