package pl.kurs.warehouse.model.dbo;

import javax.persistence.*;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private Long price;

    private Long quantity;

    private String name;

    private String description;

    //moze byc jeszcze lista faktur na ktorych jest produkt ale w sumie bez sensu

    @ManyToOne
    @JoinColumn(name="warehouse_id")
    private Warehouse warehouse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
