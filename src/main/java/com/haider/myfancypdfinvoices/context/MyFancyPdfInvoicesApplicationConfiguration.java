package com.haider.myfancypdfinvoices.context;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haider.myfancypdfinvoices.ApplicationLauncher;
import com.haider.myfancypdfinvoices.services.InvoiceService;
import com.haider.myfancypdfinvoices.services.UserService;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
@PropertySource("classpath:/application.properties")
@PropertySource(value = "classpath:/application-${spring.profiles.active}.properties", ignoreResourceNotFound = true)
public class MyFancyPdfInvoicesApplicationConfiguration {

    public UserService userService(){
        return new UserService();
    }

//    public InvoiceService invoiceService(UserService userService){
//        return new InvoiceService(userService);
//    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
}
