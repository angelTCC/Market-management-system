package repository;

import model.Venta;

import java.util.List;

public interface VentaRepository {
    void insertarVenta(Venta venta);
    List<Venta> mostrarHistorial();
}
