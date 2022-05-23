package com.frontend.frontend.models;

import lombok.*;
import org.springframework.data.annotation.Id;


@Data
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
}
