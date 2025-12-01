package model;

public abstract class Producto {

    private Integer id;
    private String nombre;
    private Double precioBase;
    private Integer stock;

    public Producto(Integer id, String nombre, Double precioBase,Integer stock) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public abstract Double calcularPrecioFinal();

    // metodos get y setter

    public Integer getId () { return this.id; }
    public String getNombre () { return this.nombre; }
    public Double getPrecioBase () { return this.precioBase; }
    public Integer getStock() { return stock; }

    public void setId (Integer e) { this.id = e; }
    public void setNombre (String e) { this.nombre = e; }
    public void setPrecioBase (Double e) { this.precioBase = e; }
    public void setStock(Integer stock) { this.stock = stock; }


}
