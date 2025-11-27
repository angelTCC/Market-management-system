package model;

public abstract class Producto {

    private Integer id;
    private String nombre;
    private Double precioBase;

    public Producto(Integer id, String nombre, Double precioBase) {
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    abstract Double calcularPrecioFinal();

    // metodos get y setter

    public Integer getId () { return this.id; }
    public String getNombre () { return this.nombre; }
    public Double getPrecioBase () { return this.precioBase; }

    public void setId (Integer e) { this.id = e; }
    public void setNombre (String e) { this.nombre = e; }
    public void setPrecioBase (Double e) { this.precioBase = e; }

}
