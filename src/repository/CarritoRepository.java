package repository;

import model.CarritoItem;

import java.util.List;

public interface CarritoRepository {
    void insertar(Integer id, CarritoItem item) ;
    List<CarritoItem> buscarTodos();
}
