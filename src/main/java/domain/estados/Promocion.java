package domain.estados;

public abstract class Promocion implements Estado {
    double descuento;
    public double precioFinal(double precioBase){
        return precioBase - descuento;
    }

    public Promocion(double descuento) {
        this.descuento = descuento;
    }
}
