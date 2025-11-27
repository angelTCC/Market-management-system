package model;

import java.util.Date;

/*
    Producto alimenticio, hereda de la clase producto, agrega nuevos atributos como
    la fecha de caducidad
*/

public class ProductoAlimenticio extends Producto implements Descontable {

    private final Double IMPUESTO = 0.1;
    private Date fecha_caducidad;

    public ProductoAlimenticio(Integer id, String nombre, Double precioBase, Date fecha_caducidad) {
        super(id, nombre, precioBase);
        this.fecha_caducidad = fecha_caducidad;
    }

    @Override
    public Double calcularPrecioFinal() {
        return getPrecioBase()*(1+IMPUESTO);
    }

    public void aplicarDescuento () {
        setPrecioBase( getPrecioBase()*(1-0.1) ); ;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }
}
