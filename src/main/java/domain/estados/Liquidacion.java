package domain.estados;

public abstract class Liquidacion implements Estado {
    public double precioFinal(double precioBase){
        return precioBase * 0.5;
    }

    public Liquidacion() {
    }
}
