package pl.kurs.warehouse.repo;

import pl.kurs.warehouse.model.dbo.Client;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-03.
 */
@Stateless
public class ClientRepo extends AbstractRepo<Client,Long> {

//    @PersistenceContext(name="clientRepo")
//    EntityManager entityManager;
//
//    public void save(Client client) {
//        entityManager.persist(client);
//    }
//
//    public void delete(Long id) {
//        Client client = entityManager.find(Client.class, id);
//        entityManager.remove(client);
//    }

//    public Client findById(Long id) {
//        return entityManager.find(Client.class, id);
//    }

    public Client findByLastName(String lastName) {
        Query query = entityManager.createQuery("select c from Client c where c.lastName like :lastName");
        query.setParameter("lastName", lastName);
        @SuppressWarnings("unchecked")
        List<Client> list =query.getResultList();
        return list.get(1);
    }

    public List<Client> getAllClients() {
        Query query = entityManager.createQuery("select c from Client c");
        @SuppressWarnings("unchecked")
        List<Client> list = query.getResultList();
        return list;
    }

//    public void update(Client client) {
//        client = entityManager.merge(client);
//    }
}
