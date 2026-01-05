package com.haider.myfancypdfinvoices.services;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DummyInvoiceServiceLoader {

    private final InvoiceService invoiceService;


    public DummyInvoiceServiceLoader(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostConstruct
    public void setup(){
        System.out.println("Creating dev invoices..");
        invoiceService.create("SomeUserId", 50);
        invoiceService.create("anUserId", 30);
    }
}
