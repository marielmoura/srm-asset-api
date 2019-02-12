package com.srmasset.customercrud.business;
import com.srmasset.customercrud.model.Customer;
import com.srmasset.customercrud.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomersBusinessImpl implements CustomersBusiness {

    @Autowired
    private CustomersRepository customersRepository;

    @Override
    public Optional<Customer> getById(String clientId) {
        return customersRepository.findById(clientId);
    }

    @Override
    public List<Customer> getAll() {
        return customersRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        customer.setInterestRate();
        return customersRepository.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customersRepository.save(customer);
    }

    @Override
    public void delete(String clientId) {
        customersRepository.deleteById(clientId);
    }

}
