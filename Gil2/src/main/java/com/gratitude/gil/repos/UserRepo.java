package com.gratitude.gil.repos;

import com.gratitude.gil.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepo extends MongoRepository<User,String> {

}
