package com.srmasset.customercrud.business;

import com.srmasset.customercrud.model.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomersBusiness {

    List<Customer> getAll();

    Customer save(Customer customer);

    void delete(String clientId);

}
