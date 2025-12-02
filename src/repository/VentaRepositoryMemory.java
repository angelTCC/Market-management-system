package repository;

import model.Venta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VentaRepositoryMemory implements VentaRepository{

    Map<Integer,Venta> historialVentas = new HashMap<>();

    @Override
    public void insertarVenta (Venta venta){
        historialVentas.put( venta.getId(), venta );
    }

    @Override
    public List<Venta> mostrarHistorial() {
        return new ArrayList<>(historialVentas.values());
    }

}
