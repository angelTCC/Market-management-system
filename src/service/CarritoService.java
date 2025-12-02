package service;
import java.util.List;

import model.CarritoItem;
import model.Producto;
import model.Venta;
import repository.CarritoRepository;
import repository.ProductoRepository;
import repository.VentaRepository;

public class CarritoService {

    private ProductoRepository productos;
    private CarritoRepository carrito;
    private VentaRepository histoVentas;

    public CarritoService(ProductoRepository productos, CarritoRepository carrito, VentaRepository histoVentas) {
        this.productos = productos;
        this.carrito = carrito;
        this.histoVentas= histoVentas;
    }

    public List<Producto> getCatalogo() {
        return productos.buscarTodos();
    }

    public void agregarAlCarrito(int id, int cantidad) {
        Producto p = productos.buscarPorId(id);
        carrito.insertar(id, new CarritoItem(cantidad, p));
    }

    public List<CarritoItem> verCarrito() {
        return carrito.buscarTodos();
    }

    public Venta pagar() {
        Venta v = new Venta(1, new java.util.Date(), carrito.buscarTodos());
        carrito.vaciarCarrito();
        return v;
    }

    public CarritoItem buscarProducto ( Integer id){
        return carrito.buscarItem(id);
    }

    public void registrarVenta (Venta v) {
        histoVentas.insertarVenta(v);
    }

}
