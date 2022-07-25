package com.gratitude.gil.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id;

    @NotEmpty
    enum status{
        IN_QUEUE, COOKING, DELIVERING
    }

    @NotEmpty
    private Meal[] meals;

    @NotEmpty
    private Table table;

}
