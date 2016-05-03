package pl.kurs.warehouse.service.mapper;

import pl.kurs.warehouse.model.dbo.Client;
import pl.kurs.warehouse.model.dto.DtoClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */
public class ClientMapper implements MapperInterface<Client, DtoClient> {

    @Override
    public Client convertToDBO(DtoClient dtoClient) {
        Client client = new Client();
        client.setId(dtoClient.getId());
        client.setAddress(dtoClient.getAddress());
        client.setFirstName(dtoClient.getFirstName());
        client.setLastName(dtoClient.getLastName());
        //wyszukanie clienta o danym id (dbo) i wrzucenie tutaj jego faktur

        return client;
    }

    @Override
    public DtoClient convertToDTO(Client client) {
        DtoClient dtoClient = new DtoClient();
        dtoClient.setId(client.getId());
        dtoClient.setFirstName(client.getFirstName());
        dtoClient.setLastName(client.getLastName());
        dtoClient.setAddress(client.getAddress());
        return dtoClient;
    }

    @Override
    public Iterable<Client> convertToDBO(Iterable<DtoClient> dto) {
        List<Client> clients = new ArrayList<Client>();
        for(DtoClient dtoClient : dto) {
            clients.add(convertToDBO(dtoClient));
        }
        return clients;
    }

    @Override
    public Iterable<DtoClient> convertToDTO(Iterable<Client> dbo) {
        List<DtoClient> clients = new ArrayList<DtoClient>();
        for(Client client : dbo){
            clients.add(convertToDTO(client));
        }
        return clients;
    }
}
