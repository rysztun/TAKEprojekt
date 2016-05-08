package pl.kurs.warehouse.service.mapper;

import pl.kurs.warehouse.model.dbo.Invoice;
import pl.kurs.warehouse.model.dto.DtoInvoice;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class InvoiceMapper implements MapperInterface<Invoice, DtoInvoice> {
    @Override
    public Invoice convertToDBO(DtoInvoice dtoInvoice) {
        Invoice invoice = new Invoice();
        invoice.setId(dtoInvoice.getId());
        invoice.setCreated(dtoInvoice.getCreated());
        if(dtoInvoice.getClientId() != null) {
            //wyszukiwanie klienta po id i setClient
        }

        //szukanie invoice po id i przypisanie listy produktow
        return invoice;
    }

    @Override
    public DtoInvoice convertToDTO(Invoice invoice) {
        DtoInvoice dtoInvoice = new DtoInvoice();
        dtoInvoice.setId(invoice.getId());
        if(invoice.getClient() != null) {
            dtoInvoice.setClientId(invoice.getClient().getId());
        }
        dtoInvoice.setCreated(invoice.getCreated().getTime());
        return dtoInvoice;
    }

    @Override
    public List<Invoice> convertToDBO(Iterable<DtoInvoice> dto) {
        List<Invoice> invoices = new ArrayList<Invoice>();
        for(DtoInvoice invoice : dto) {
            invoices.add(convertToDBO(invoice));
        }
        return invoices;
    }

    @Override
    public List<DtoInvoice> convertToDTO(Iterable<Invoice> dbo) {
        List<DtoInvoice> invoices = new ArrayList<DtoInvoice>();
        for(Invoice invoice : dbo ) {
            invoices.add(convertToDTO(invoice));
        }
        return invoices;
    }
}
