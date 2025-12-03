package model;

import java.util.Date;
import java.util.List;

public class Venta {

    private Integer id;
    private Date fecha;
    private List<CarritoItem> items;
    private Double total;

    public Venta(Integer id, Date fecha, List<CarritoItem> items, Double total) {
        this.id = id;
        this.fecha = fecha;
        this.items = items;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<CarritoItem> getItems() {
        return items;
    }
    public void setItems(List<CarritoItem> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
