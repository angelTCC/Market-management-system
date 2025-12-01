package repository;

import model.Producto;
import java.util.*;

public class ProductoRepositoryMemory implements ProductoRepository {

    private Map<Integer, Producto> store = new HashMap<>();

    @Override
    public void insertar(Producto producto) {
        store.put(producto.getId(), producto);
    }

    @Override
    public void actualizar(Producto producto) {
        store.put(producto.getId(), producto); // reemplaza si existe
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
