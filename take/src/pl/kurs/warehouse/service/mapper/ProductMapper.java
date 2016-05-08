package pl.kurs.warehouse.service.mapper;

import pl.kurs.warehouse.model.dbo.Product;
import pl.kurs.warehouse.model.dto.DtoProduct;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class ProductMapper implements MapperInterface<Product, DtoProduct> {
    @Override
    public Product convertToDBO(DtoProduct dtoProduct) {
        Product product = new Product();
        product.setId(dtoProduct.getId());
        product.setName(dtoProduct.getName());
        product.setDescription(dtoProduct.getDescription());
        product.setPrice(dtoProduct.getPrice());
        product.setQuantity(dtoProduct.getQuantity());
//        wyszukanie danego warehouse i przypisanie jesli nie zwroci null
//        dtoProduct.getWarehouseId()
        return product;
    }

    @Override
    public DtoProduct convertToDTO(Product product) {
        DtoProduct dtoProduct = new DtoProduct();
        dtoProduct.setId(product.getId());
        dtoProduct.setName(product.getName());
        dtoProduct.setDescription(product.getDescription());
        dtoProduct.setPrice(product.getPrice());
        dtoProduct.setQuantity(product.getQuantity());
        if(product.getWarehouse() != null) {
            dtoProduct.setWarehouseId(product.getWarehouse().getId());
        }
        return dtoProduct;
    }

    @Override
    public List<Product> convertToDBO(Iterable<DtoProduct> dto) {
        List<Product> products = new ArrayList<Product>();
        for(DtoProduct product : dto) {
            products.add(convertToDBO(product));
        }

        return products;
    }

    @Override
    public List<DtoProduct> convertToDTO(Iterable<Product> dbo) {
        List<DtoProduct> products = new ArrayList<DtoProduct>();
        for(Product product : dbo) {
            products.add(convertToDTO(product));
        }
        return products;
    }
}
