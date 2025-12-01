import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.text.DecimalFormat;
import java.util.*;

import model.ProductoAlimenticio;
import model.ProductoElectronico;
import repository.ProductoRepository;
import repository.ProductoRepositoryMemory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductoRepository repo = new ProductoRepositoryMemory();

    // Productos alimenticios con stock
        ProductoAlimenticio leche = new ProductoAlimenticio(1, "Leche", 5.0, new Date(), 20);
        ProductoAlimenticio pan = new ProductoAlimenticio(2, "Pan", 3.0, new Date(), 50);
        ProductoAlimenticio queso = new ProductoAlimenticio(3, "Queso", 12.0, new Date(), 15);
        ProductoAlimenticio yogur = new ProductoAlimenticio(4, "Yogur", 4.5, new Date(), 30);
        ProductoAlimenticio manzana = new ProductoAlimenticio(5, "Manzana", 2.0, new Date(), 100);
        ProductoAlimenticio arroz = new ProductoAlimenticio(6, "Arroz", 6.0, new Date(), 80);

    // Productos electrónicos con stock
        ProductoElectronico tv = new ProductoElectronico(7, "TV", 1500.0, 24, 10);
        ProductoElectronico laptop = new ProductoElectronico(8, "Laptop", 3500.0, 12, 5);
        ProductoElectronico celular = new ProductoElectronico(9, "Celular", 2500.0, 18, 20);
        ProductoElectronico tablet = new ProductoElectronico(10, "Tablet", 1200.0, 12, 15);
        ProductoElectronico consola = new ProductoElectronico(11, "Consola", 1800.0, 24, 7);
        ProductoElectronico auriculares = new ProductoElectronico(12, "Auriculares", 200.0, 6, 50);

    // Insertar todos en el repositorio
        repo.insertar(leche);
        repo.insertar(pan);
        repo.insertar(queso);
        repo.insertar(yogur);
        repo.insertar(manzana);
        repo.insertar(arroz);
        repo.insertar(tv);
        repo.insertar(laptop);
        repo.insertar(celular);
        repo.insertar(tablet);
        repo.insertar(consola);
        repo.insertar(auriculares);

        boolean exit = true;

        while (exit) {

            System.out.println("Tienda TECH-SHOP:");
            System.out.println("=======================================");
            System.out.println(
                    "1. Ver catálogos de Productos\n" +
                            "2. Ver carritos de compras\n" +
                            "3. Pagar y salir\n" +
                            "4. Salir del sistema"
            );

            Scanner input_opcion = new Scanner(System.in);
            System.out.print("Ingresa una opcion: ");
            Integer opcion = input_opcion.nextInt();


            switch (opcion) {
                case 1 -> {

                    // mostrando el catalogo

                    System.out.println("> Seleccionaste Catalogo");
                    System.out.println("---- CATALOGO DISPONIBLE----");
                    // Mostrar todos
                    List<model.Producto> productos = repo.buscarTodos();
                    System.out.println("Todos los productos:");
                    System.out.println("Catalogo disponible");
                    System.out.println("------------------------------------");
                    System.out.println("ID-- NOMBRE -- PRECIO -- STOCK");
                    System.out.println("--------------------------------------");
                    DecimalFormat df = new DecimalFormat("#.##");
                    for (model.Producto p : productos) {
                        System.out.println(
                                p.getId() + "---" +
                                p.getNombre() + "--" +
                                        df.format(p.calcularPrecioFinal()) + "---" +
                                p.getStock());
                    }
                    System.out.println("------------------------------------");
                    // ingresando valores
                    /*
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Ingrese el ID del producto a agregar: ");
                    Integer id_sel = sc.nextInt();
                    System.out.print("Ingrese la cantidad: ");
                    Integer cant_sel = sc.nextInt();

                    // mostrando resultado parcial
                    System.out.printf("se agregaro %d unidades de %d al carrito \n", id_sel, cant_sel);
                    System.out.print("subtotal (falta implementar)");
                    */

                }
                case 2 -> System.out.printf("> Seleccionaste %d", opcion);
                case 3 -> System.out.printf("> Seleccionaste %d", opcion);
                case 4 -> {
                    System.out.printf("> Seleccionaste %d", opcion);
                    exit = false;
                }
            }
        }


        // Buscar por ID
        model.Producto buscado = repo.buscarPorId(1);
        System.out.println("\nProducto buscado con ID 1: " + buscado.getNombre());
    }
        // inventario actual
        /*
        Map<Integer, Double> inventario = new HashMap<>(
                Map.of(1,100.2,
                        2, 200.2,
                        3, 300.3)
        );

        // carrito
        List<Integer> carrito = new ArrayList<Integer>();


        boolean exit = true;

        while (exit) {

            System.out.println("Tienda TECH-SHOP:");

            System.out.println("=======================================");

            System.out.println(
                    "1. Ver catálogos de Productos\n" +
                            "2. Ver carritos de compras\n" +
                            "3. Pagar y salir\n" +
                            "4. Salir del sistema"
            );

            Scanner input_opcion = new Scanner(System.in);
            System.out.print("Ingresa una opcion: ");
            Integer opcion = input_opcion.nextInt();


            switch (opcion) {
                case 1 -> {

                    // mostrando el catalogo

                    System.out.println("> Seleccionaste Catalogo");
                    System.out.println("---- CATALOGO DISPONIBLE----");
                    System.out.println(inventario);

                    // ingresando valores

                    Scanner sc = new Scanner(System.in);
                    System.out.print("Ingrese el ID del producto a agregar: ");
                    Integer id_sel = sc.nextInt();
                    System.out.print("Ingrese la cantidad: ");
                    Integer cant_sel = sc.nextInt();

                    // mostrando resultado parcial

                    System.out.printf("se agregaro %d unidades de %d al carrito \n", id_sel, cant_sel);
                    System.out.print("subtotal (falta implementar)");

                }
                case 2 -> System.out.printf("> Seleccionaste %d", opcion);
                case 3 -> System.out.printf("> Seleccionaste %d", opcion);
                case 4 -> {
                    System.out.printf("> Seleccionaste %d", opcion);
                    exit = false;
                }
            }
        }

         */

}