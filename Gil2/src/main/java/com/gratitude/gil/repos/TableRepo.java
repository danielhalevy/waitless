package com.gratitude.gil.repos;

import com.gratitude.gil.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TableRepo extends MongoRepository<Table,String> {

}
