package model;

import java.util.Date;

public class ProductoAlimenticio extends Producto{

    private Date fecha_caducidad;

    public ProductoAlimenticio(Integer id, String nombre, Double precioBase, Date fecha_caducidad, Integer stock) {
        super(id, nombre, precioBase, stock);
        this.fecha_caducidad = fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }
}
