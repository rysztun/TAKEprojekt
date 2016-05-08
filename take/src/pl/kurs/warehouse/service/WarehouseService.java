package pl.kurs.warehouse.service;

import pl.kurs.warehouse.model.dbo.Warehouse;
import pl.kurs.warehouse.model.dto.DtoWarehouse;
import pl.kurs.warehouse.repo.WarehouseRepo;
import pl.kurs.warehouse.service.mapper.WarehouseMapper;

import javax.ejb.Stateless;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class WarehouseService extends AbstractService<Warehouse, DtoWarehouse, WarehouseRepo, WarehouseMapper> {
}
