package pl.kurs.warehouse.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.lang.reflect.ParameterizedType;

/**
 * Created by Sebastian on 2016-05-03.
 */
abstract public class AbstractRepo <DBO, IdType> {

    @PersistenceContext(name = "warehouse")
    EntityManager entityManager;

    Class<DBO> dboObjectClass = (Class<DBO>)
            ((ParameterizedType)getClass().getGenericSuperclass())
                    .getActualTypeArguments()[0];


    public DBO findById(IdType id) {

        DBO dbo = entityManager.find(dboObjectClass, id);
        return dbo;
    }

    public void save(DBO dbo) {
        entityManager.persist(dbo);
    }

    public void save(Iterable<DBO> dbos){
        for(DBO dbo : dbos) {
            entityManager.persist(dbo);
        }
    }

    public void delete(DBO dbo) {
        entityManager.remove(dbo);
    }

    public void delete(Iterable<DBO> dbos) {
        for(DBO dbo : dbos) {
            entityManager.remove(dbo);
        }
    }

    public void update(DBO dbo) {
        dbo = entityManager.merge(dbo);
    }
}
