package pl.kurs.warehouse.model.dbo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private Date created;

    @PrePersist
    protected void setCreate() {
        created = new Date();
    }

    public void setCreated(Long date) {
        created = new Date(date);
    }

    public Date getCreated(){
        return created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
