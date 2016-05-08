package pl.kurs.warehouse.controller;

import pl.kurs.warehouse.model.dbo.Client;
import pl.kurs.warehouse.model.dto.DtoClient;
import pl.kurs.warehouse.service.ClientService;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-04.
 */
@Path("/client")
@Stateless
public class ClientController implements ControllerInterface {

    @EJB
    ClientService service;

    @Override
    @POST
    @Path("/create")
    public String create(InputStream is) {
        DtoClient dtoClient = JAXB.unmarshal(is, DtoClient.class);
        service.save(dtoClient);
        return "client created!";
    }

    @Override
    @GET
    @Path("/find/{id}")
    public String find(@PathParam("id") Long id) {
        DtoClient dtoClient = service.findOne(id);
        StringWriter stringWriter = new StringWriter();
        JAXB.marshal(dtoClient, stringWriter);
        return stringWriter.toString();

    }

    @Override
    @GET
    @Path("/get")
    public String get() {
        Iterable<DtoClient> listClients = service.getAll();
        StringWriter stringWriter = new StringWriter();
        JAXB.marshal(listClients,stringWriter);
        return stringWriter.toString();
    }

    @Override
    public String update(InputStream is) {
        try {
            DtoClient dtoClient = (DtoClient) JAXB.unmarshal(is, DtoClient.class);
            service.update(dtoClient);
            return "Client updated";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "client not updated";
        }
    }

    @Override
    @GET
    @Path("/delete/{id}")
    public void delete(@PathParam("id") Long id) {
//        service.de

    }
}
