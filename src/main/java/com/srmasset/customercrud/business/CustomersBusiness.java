package com.srmasset.customercrud.business;

import com.srmasset.customercrud.model.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomersBusiness {

    Optional<Customer> getById(String clientId);

    List<Customer> getAll();

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(String clientId);

}
