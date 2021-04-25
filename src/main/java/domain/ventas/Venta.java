
package domain.ventas;

import java.util.List;

abstract class Venta {
    public List<Item> items;
    abstract double conRecargo(double importeBase);
    double importe(){
        return items.stream().mapToDouble(Item::importe).sum();
    }

    public Venta(List<Item> items) {
        this.items = items;
    }
}
