package com.gratitude.gil.repos;

import com.gratitude.gil.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepo extends MongoRepository<Table,String> {

}
