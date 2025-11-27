package model;

public class CarritoItem {

    private Integer id;
    private Integer cantidad;

    public CarritoItem (Integer id, Integer cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
