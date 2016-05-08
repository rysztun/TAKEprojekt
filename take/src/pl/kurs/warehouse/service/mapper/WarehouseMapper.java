package pl.kurs.warehouse.service.mapper;

import pl.kurs.warehouse.model.dbo.Warehouse;
import pl.kurs.warehouse.model.dto.DtoWarehouse;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class WarehouseMapper implements MapperInterface<Warehouse, DtoWarehouse> {
    @Override
    public Warehouse convertToDBO(DtoWarehouse dtoWarehouse) {
        Warehouse warehouse = new Warehouse();
        warehouse.setId(dtoWarehouse.getId());
        warehouse.setCapacity(dtoWarehouse.getCapacity());
        warehouse.setLocation(dtoWarehouse.getLocation());
//      szukamy warehouse o okreslonym id i warehouse.setProducts();
        return warehouse;
    }

    @Override
    public DtoWarehouse convertToDTO(Warehouse warehouse) {
        DtoWarehouse dtoWarehouse = new DtoWarehouse();
        dtoWarehouse.setId(warehouse.getId());
        dtoWarehouse.setLocation(warehouse.getLocation());
        dtoWarehouse.setCapacity(warehouse.getCapacity());
        return dtoWarehouse;
    }

    @Override
    public List<Warehouse> convertToDBO(Iterable<DtoWarehouse> dto) {
        List<Warehouse> warehouses = new ArrayList<Warehouse>();
        for(DtoWarehouse warehouse : dto) {
            warehouses.add(convertToDBO(warehouse));
        }
        return warehouses;
    }

    @Override
    public List<DtoWarehouse> convertToDTO(Iterable<Warehouse> dbo) {
        List<DtoWarehouse> warehouses = new ArrayList<DtoWarehouse>();
        for(Warehouse warehouse : dbo) {
            warehouses.add(convertToDTO(warehouse));
        }
        return warehouses;
    }
}
