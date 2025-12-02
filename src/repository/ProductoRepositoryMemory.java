package repository;

import model.Producto;
import model.ProductoAlimenticio;
import model.ProductoElectronico;

import java.util.*;

public class ProductoRepositoryMemory implements ProductoRepository {

    private Map<Integer, Producto> store = new HashMap<>();

    public ProductoRepositoryMemory() {

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

        // Insertar todos en el mapa
        store.put(leche.getId(), leche);
        store.put(pan.getId(), pan);
        store.put(queso.getId(), queso);
        store.put(yogur.getId(), yogur);
        store.put(manzana.getId(), manzana);
        store.put(arroz.getId(), arroz);
        store.put(tv.getId(), tv);
        store.put(laptop.getId(), laptop);
        store.put(celular.getId(), celular);
        store.put(tablet.getId(), tablet);
        store.put(consola.getId(), consola);
        store.put(auriculares.getId(), auriculares);
    }

    @Override
    public void insertar(Producto producto) {
        store.put(producto.getId(), producto);
    }

    @Override
    public void actualizar(Producto producto) {
        store.put(producto.getId(), producto);
    }

    @Override
    public void borrar(Integer id) {
        store.remove(id);
    }

    @Override
    public Producto buscarPorId(Integer id) {
        return store.get(id);
    }

    @Override
    public List<Producto> buscarTodos() {
        return new ArrayList<>(store.values());
    }
}

