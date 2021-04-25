package domain.estados;

import domain.estados.Estado;
import domain.tipos.TipoPrenda;

public class Prenda {
    TipoPrenda tipo;
    Estado estado;
    double precioPropio;
  public   double precio(){
        return estado.precioFinal(precioPropio);
    }

    public Prenda(TipoPrenda tipo, Estado estado, double precioPropio) {
        this.tipo = tipo;
        this.estado = estado;
        this.precioPropio = precioPropio;
    }
}
