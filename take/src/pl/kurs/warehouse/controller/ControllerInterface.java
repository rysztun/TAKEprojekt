package pl.kurs.warehouse.controller;

import javax.ejb.Local;
import java.io.InputStream;

/**
 * Created by Sebastian on 2016-05-04.
 */
@Local
public interface ControllerInterface {

    public abstract String create(InputStream is);

    public abstract String find(Long idc);

    public abstract String get();

    public abstract String update(InputStream is);

    public abstract void delete(Long idc);
}
