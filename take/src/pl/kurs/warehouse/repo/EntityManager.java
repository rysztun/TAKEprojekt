package pl.kurs.warehouse.repo;

import javax.ejb.Stateless;
import javax.persistence.PersistenceContext;

/**
 * Created by Sebastian on 2016-05-05.
 */

public class EntityManager {

    @PersistenceContext(name = "wholesale")
    javax.persistence.EntityManager entityManager;
}
