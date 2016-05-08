package pl.kurs.warehouse.service;

import pl.kurs.warehouse.model.dbo.Client;
import pl.kurs.warehouse.model.dto.DtoClient;
import pl.kurs.warehouse.repo.ClientRepo;
import pl.kurs.warehouse.service.mapper.ClientMapper;
import pl.kurs.warehouse.service.mapper.MapperInterface;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class ClientService extends AbstractService<Client, DtoClient, ClientRepo, ClientMapper> {

    public List<DtoClient> getAll() {
        return mapper.convertToDTO(repo.getAllClients());
    }
}
