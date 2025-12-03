package ui;

import model.CarritoItem;
import model.Producto;
import model.Venta;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    private Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");

    public int mostrarMenu() {
        System.out.println("Tienda DEV-SHOP:");
        System.out.println("1. Ver catalogo");
        System.out.println("2. Ver carrito");
        System.out.println("3. Pagar");
        System.out.println("4. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public void mostrarCatalogo(List<Producto> productos) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("------------------------------------");
        System.out.println("ID ---- NOMBRE -- PRECIO ---- STOCK");
        System.out.println("--------------------------------------");

        for (Producto p : productos) {
            System.out.println(
                    p.getId() + "---" +
                            p.getNombre() + "--" +
                            df.format(p.getPrecioBase()) + "---" +
                            p.getStock());
        }

        System.out.println("------------------------------------");
    }

    public void mostrarCarrito(List<CarritoItem> items){
        for ( CarritoItem item: items ) {
            System.out.println(
                    item.getProducto().getNombre() + "----" +
                            item.getCantidad() + "----" +
                            df.format(item.getProducto().getPrecioBase()*item.getCantidad())
            );
        }
    }

    public void infoProductoAgregado(CarritoItem item){
        System.out.printf("Se agregaro %d unidades de %s al carrito \n", item.getCantidad(), item.getProducto().getNombre());
        System.out.printf("subtotal: %s \n", df.format( item.getProducto().getPrecioBase()*item.getCantidad()) );
    }

    public void infoVenta ( Venta venta) {
        System.out.println(
                venta.getFecha() + "----" +
                venta.getTotal()
        );
    }

    public int pedirId() {
        System.out.print("Ingrese ID del producto: ");
        return sc.nextInt();
    }

    public int pedirCantidad() {
        System.out.print("Ingrese cantidad: ");
        return sc.nextInt();
    }

    public void pausar() {
        System.out.println("Presione ENTER para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
}
