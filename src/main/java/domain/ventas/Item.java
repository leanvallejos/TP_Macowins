package domain.ventas;

import domain.estados.Prenda;

class Item {
    double cantidad;
    Prenda prenda;

  double importe(){
        return prenda.precio() * cantidad;
    }
}
