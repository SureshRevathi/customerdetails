package com.customer.customer.controller;

import com.customer.customer.dto.customerrequest;
import com.customer.customer.service.customerservice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")
@RequiredArgsConstructor
public class customercontroller {
    @Autowired
    private final customerservice customerservice;


    @PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCustomer(@RequestBody customerrequest customerrequest){
        System.out.println("@#@#@ Product Details : "+customerrequest);
        customerservice.createProduct(customerrequest);

    }

}
