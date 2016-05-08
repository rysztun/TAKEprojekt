package pl.kurs.warehouse.model.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Sebastian on 2016-05-02.
 */
@XmlRootElement
public class DtoWarehouse {

    private long id;

    private long capacity;

    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
