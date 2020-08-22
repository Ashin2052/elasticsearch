package com.example.elasticSearch.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Document(indexName = "ashin&co.",type="costumer",shards = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Costumer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;

}
