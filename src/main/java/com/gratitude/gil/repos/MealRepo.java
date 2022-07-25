package com.gratitude.gil.repos;

import com.gratitude.gil.model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepo extends MongoRepository<Meal,String> {

}
