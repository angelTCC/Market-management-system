import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // inventario actual
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
    }
}