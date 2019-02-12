package com.srmasset.customercrud.repository;

import com.srmasset.customercrud.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomersRepository extends MongoRepository<Customer, String> {

}