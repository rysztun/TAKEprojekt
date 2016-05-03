package pl.kurs.warehouse.model.dto;

/**
 * Created by Sebastian on 2016-05-02.
 */
public class DtoInvoice {

    private Long id;

    private Long created;

    private Long clientId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
