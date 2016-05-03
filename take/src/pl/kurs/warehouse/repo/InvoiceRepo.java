package pl.kurs.warehouse.repo;

import pl.kurs.warehouse.model.dbo.Invoice;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-03.
 */
@Stateless
public class InvoiceRepo extends AbstractRepo<Invoice,Long> {

//    @PersistenceContext(name = "invoiceRepo")
//    EntityManager entityManager;
//
//    public void save (Invoice invoice) {
//        entityManager.persist(invoice);
//    }
//
//    public void delete(Long id) {
//        Invoice invoice = entityManager.find(Invoice.class, id);
//        entityManager.remove(invoice);
//    }
//
//    public Invoice findById(Long id) {
//        return entityManager.find(Invoice.class, id);
//    }

    public List<Invoice> findByClient(String clientLastName) {
        //czy to ma sens??
        Query query = entityManager.createQuery("select i from Invoice i where i.client.lastName like :client ");
        query.setParameter("client", clientLastName);
        @SuppressWarnings("unchecked")
        List<Invoice> list = query.getResultList();
        return  list;
    }

    public List<Invoice> getAllInvoices() {
        Query query = entityManager.createQuery("select i from Invoice i");
        @SuppressWarnings("unchecked")
        List<Invoice> list = query.getResultList();
        return  list;
    }
//
//    public void update(Invoice invoice) {
//        invoice = entityManager.merge(invoice);
//    }
}
