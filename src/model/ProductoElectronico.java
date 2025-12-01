package model;

/*
    Clase producto electronico, tiene tiempo de garantica en meses,
    impuesto calculado en porcentaje (decimales)
 */

public class ProductoElectronico extends Producto {

    private Integer garantia ;
    private final Double IMPUESTO = 0.3;

    public ProductoElectronico ( Integer id, String nombre, Double precioBase, Integer garantia, Integer stock) {
        super(id, nombre, precioBase, stock);
        this.garantia = garantia;
    }

    @Override
    public Double calcularPrecioFinal() {
        return getPrecioBase()*(1+IMPUESTO);
    }

    public Integer getGarantia () { return this.garantia; }
    public void setGarantia (Integer garantia) { this.garantia = garantia; }
}
