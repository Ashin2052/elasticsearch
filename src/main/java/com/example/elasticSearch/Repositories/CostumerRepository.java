package com.example.elasticSearch.Repositories;

import java.util.List;

import com.example.elasticSearch.modal.Costumer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface CostumerRepository extends ElasticsearchRepository<Costumer, String>{

    List<Costumer> findByFirstName(String firstName);

}
