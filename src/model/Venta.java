package model;

import java.util.Date;
import java.util.List;

public class Venta {

    private Integer id;
    private Date fecha;
    private List<CarritoItem> items;
    private double total;

    public Venta(Integer id, Date fecha, List<CarritoItem> items) {
        this.id = id;
        this.fecha = fecha;
        this.items = items;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        return items.stream()
                .mapToDouble(CarritoItem::getSubtotal)
                .sum();
    }

    public Integer getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<CarritoItem> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }
}
