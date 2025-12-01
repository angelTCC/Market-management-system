package repository;

import model.CarritoItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarritoRepositoryMemory implements CarritoRepository {

    private Map<Integer, CarritoItem> items = new HashMap<>();

    @Override
    public void insertar( Integer id, CarritoItem item) {
        items.put( id, item );
    }

    @Override
    public List<CarritoItem> buscarTodos() {
        return new ArrayList<>(items.values());
    }

}
