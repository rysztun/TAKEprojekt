package pl.kurs.warehouse.service;

import pl.kurs.warehouse.model.dbo.Invoice;
import pl.kurs.warehouse.model.dto.DtoInvoice;
import pl.kurs.warehouse.repo.InvoiceRepo;
import pl.kurs.warehouse.service.mapper.InvoiceMapper;

import javax.ejb.Stateless;

/**
 * Created by Sebastian on 2016-05-02.
 */
@Stateless
public class InvoiceService extends AbstractService<Invoice, DtoInvoice, InvoiceRepo, InvoiceMapper> {
}
