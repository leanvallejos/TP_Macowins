package domain.ventas;

import java.util.List;

public class VentaEfectivo extends  Venta{
    public VentaEfectivo(List<Item> items) {
        super(items);
    }

    @Override
    double conRecargo(double importeBase) {
        return importeBase;
    }
}
