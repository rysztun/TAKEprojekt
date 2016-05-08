package pl.kurs.warehouse.service;

import pl.kurs.warehouse.model.dbo.Product;
import pl.kurs.warehouse.model.dto.DtoProduct;
import pl.kurs.warehouse.repo.ProductRepo;
import pl.kurs.warehouse.service.mapper.ProductMapper;

import javax.ejb.Stateless;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class ProductService extends AbstractService<Product, DtoProduct, ProductRepo, ProductMapper> {
}
