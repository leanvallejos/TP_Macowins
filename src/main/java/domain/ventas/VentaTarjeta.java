package domain.ventas;

import java.util.List;

 class VentaTarjeta extends Venta{
    double cantidadCuotas;
    double coeficienteTarjeta;

    public VentaTarjeta(List<Item> items) {
        super(items);
    }
    @Override
    double conRecargo(double importeBase){
        return
                importeBase * (coeficienteTarjeta * cantidadCuotas + 1.01);
    }
}