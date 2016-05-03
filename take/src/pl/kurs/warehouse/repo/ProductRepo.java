package pl.kurs.warehouse.repo;

import pl.kurs.warehouse.model.dbo.Product;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-03.
 */
@Stateless
public class ProductRepo extends AbstractRepo<Product,Long> {

//    @PersistenceContext
//    EntityManager entityManager;
//
//    public void create(Product product) {
//        entityManager.persist(product);
//    }
//
//    public void delete(Long id) {
//        Product product = entityManager.find(Product.class, id);
//        entityManager.remove(product);
//    }
//
//    public Product findyById(Long id) {
//        return entityManager.find(Product.class, id);
//    }

    public Product findByName (String name) {
        Query query = entityManager.createQuery("select p from Product p where p.name like :name");
        query.setParameter("name", name);
        @SuppressWarnings("unchecked")
        List<Product> list = query.getResultList();
        return list.get(1);
    }

    public List<Product> getAllProducts () {
        Query query = entityManager.createQuery("select p from Product p");
        @SuppressWarnings("unchecked")
        List<Product> list = query.getResultList();
        return list;
    }

//    public void update(Product product) {
//        product = entityManager.merge(product);
//    }
}
