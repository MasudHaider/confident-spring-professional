package com.haider.myfancypdfinvoices.web;

import com.haider.myfancypdfinvoices.dto.InvoiceDTO;
import com.haider.myfancypdfinvoices.model.Invoice;
import com.haider.myfancypdfinvoices.services.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvoicesController {

    private final InvoiceService invoiceService;

    public InvoicesController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices")
    public List<Invoice> invoices(){
        return invoiceService.findAll();
    }

    @PostMapping("/invoices")
    public Invoice createInvoice(@RequestBody @Valid InvoiceDTO invoiceDTO){
        return invoiceService.create(invoiceDTO.getUserId(), invoiceDTO.getAmount());
    }
}
