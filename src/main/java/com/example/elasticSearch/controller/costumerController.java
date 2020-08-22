package com.example.elasticSearch.controller;

import com.example.elasticSearch.Repositories.CostumerRepository;
import com.example.elasticSearch.modal.Costumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class costumerController {
    @Autowired
    private CostumerRepository repository;

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Costumer> customers) {
        repository.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Costumer> findAllCustomers() {
        return repository.findAll();
    }

    @GetMapping("/findByFName/{firstName}")
    public List<Costumer> findByFirstName(@PathVariable String firstName) {
        return repository.findByFirstName(firstName);
    }
}
