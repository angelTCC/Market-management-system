package repository;

import model.Producto;

import java.util.List;

public interface ProductoRepository {
    void insertar(Producto producto);
    void actualizar(Producto producto);
    void borrar(Integer id);
    Producto buscarPorId(Integer id);
    List<Producto> buscarTodos();
}