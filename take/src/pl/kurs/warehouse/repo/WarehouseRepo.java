package pl.kurs.warehouse.repo;

import pl.kurs.warehouse.model.dbo.Warehouse;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-03.
 */
@Stateless
public class WarehouseRepo extends AbstractRepo<Warehouse,Long> {

//    @PersistenceContext
//    EntityManager entityManager;
//
//    public void create(Warehouse warehouse) {
//        entityManager.persist(warehouse);
//    }
//
//    public void delete(Long id){
//        Warehouse warehouse = entityManager.find(Warehouse.class, id);
//        entityManager.remove(warehouse);
//    }
//
//    public Warehouse findById(Long id){
//        return entityManager.find(Warehouse.class, id);
//    }

    public List<Warehouse> findByLocation(String location) {
        Query query = entityManager.createQuery("select w from Warehouse w where w.location like :location");
        query.setParameter("location", location);
        @SuppressWarnings("unchecked")
        List<Warehouse> list = query.getResultList();
        return list;
    }

    public List<Warehouse> getAllWarehouses() {
        Query query = entityManager.createQuery("select w from Warehouse  w");
        @SuppressWarnings("unchecked")
        List<Warehouse> list = query.getResultList();
        return list;
    }
//
//    public void update(Warehouse warehouse) {
//        warehouse = entityManager.merge(warehouse);
//    }
}

