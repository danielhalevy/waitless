package com.gratitude.gil.model;

import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Document(collection = "meals")
public class Meal {
    @Id
    private String id;

    @NotEmpty
    @Size(min = 2, message = "not a good fit")
    private String name;

//    @NotEmpty
//    private Binary photo;

    @NotEmpty
    @Size(min = 1, message = "not a good fit")
    private String description;

    @NotEmpty
    private double price;

    private int[] review;

}
