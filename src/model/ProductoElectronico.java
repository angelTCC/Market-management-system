package model;

public class ProductoElectronico extends Producto {

    private Integer garantia ;

    public ProductoElectronico ( Integer id, String nombre, Double precioBase, Integer garantia, Integer stock) {
        super(id, nombre, precioBase, stock);
        this.garantia = garantia;
    }

    public Integer getGarantia () {
        return this.garantia;
    }

    public void setGarantia (Integer garantia) {
        this.garantia = garantia;
    }
}
