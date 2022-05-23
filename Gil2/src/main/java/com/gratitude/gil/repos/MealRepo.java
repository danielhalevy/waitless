package com.gratitude.gil.repos;

import com.gratitude.gil.model.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MealRepo extends MongoRepository<Meal,String> {

}
