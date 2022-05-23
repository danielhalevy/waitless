package com.gratitude.gil.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NotEmpty
    @Size(min = 2, max = 20, message = "not a good fit")
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 20, message = "not a good fit")
    private String lastName;

    @NotEmpty
    @Size(min = 9, max = 10, message = "not a good fit")
    private String phoneNumber;

    @NotEmpty
    @Size(min=5,max=30,message = "not a good fit")
    private String email;

    @NotEmpty
    @Size(min=2,max=20,message = "not a good fit")
    private String password;
}
