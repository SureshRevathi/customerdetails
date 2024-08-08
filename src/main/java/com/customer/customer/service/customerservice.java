package com.customer.customer.service;

import com.customer.customer.Model.customerdetails;
import com.customer.customer.dto.customerrequest;
import com.customer.customer.repository.customerrepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class customerservice {
    private static final Logger log = LoggerFactory.getLogger(customerservice.class);

    private final customerrepository customerrepository ;

    public customerdetails customerdetails;

    public void createProduct(customerrequest customerrequest){
        System.out.println("Product details : "+customerrequest);
        customerdetails = new customerdetails();
        customerdetails.setName(customerrequest.getName());
        customerdetails.setAddress(customerrequest.getAddress());
        customerdetails.setPhno(customerrequest.getPhno());
        customerrepository.save(customerdetails);
        log.info("Product is created");
    }
}
