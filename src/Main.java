import java.text.DecimalFormat;
import java.util.*;

import model.*;
import repository.*;
import service.CarritoService;
import ui.MenuPrincipal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductoRepository repo = new ProductoRepositoryMemory();
        CarritoRepository carrito = new CarritoRepositoryMemory();
        VentaRepository histoVenta = new VentaRepositoryMemory();

        CarritoService service = new CarritoService(repo, carrito, histoVenta);

        MenuPrincipal menu = new MenuPrincipal();

        boolean exit = true;

        while (exit) {

            Integer opcion = menu.mostrarMenu();

            switch (opcion) {
                case 1 -> {

                    // mostrando el catalogo
                    menu.mostrarCatalogo(service.getCatalogo());

                    // seleccionando producto y cantidad
                    Integer producto_id = menu.pedirId();
                    Integer cantidad = menu.pedirCantidad();

                    // agregando producto al carrito
                    service.agregarAlCarrito(producto_id, cantidad);

                    // info producto y cantidad
                    menu.infoProductoAgregado(service.buscarProducto(producto_id));

                    menu.pausar();
                }
                case 2 -> {

                    // Mostrar el carrito con los productos
                    menu.mostrarCarrito(service.verCarrito());
                    menu.pausar();

                }
                case 3 -> {

                    // se guarda la venta en el historial y se vacia el carrito
                    Venta venta = service.pagar();
                    menu.infoVenta(venta);
                    service.registrarVenta(venta);
                    //exit = false;
                    menu.pausar();


                }
                case 4 -> {
                    exit = false;
                }
            }
        }

    }
}