package com.haider.myfancypdfinvoices.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haider.myfancypdfinvoices.services.InvoiceService;

public class Application {
    public static final InvoiceService invoiceService = new InvoiceService();
    public static final ObjectMapper objectMapper = new ObjectMapper();
}
