package com.customer.customer.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.customer.customer.Model.customerdetails;

public interface customerrepository extends MongoRepository<customerdetails, String> {

}
