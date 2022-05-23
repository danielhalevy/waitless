package com.gratitude.gil.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.LinkedList;

@Data
@Document(collection = "tables")
public class Table {
    @Id
    private String id;

    @NotEmpty
    @Size(min = 1, max = 20, message = "not a good fit")
    private int space;

    private LinkedList<String>  users;

    public String addUser(String id){
        if(users==null)
            users=new LinkedList<>();
        if(users.size()<=space){
            return "No space left in this table!";
        }
        else{
            if(users.contains(id))
                return "User is already sitting in this table!";
            else {
                users.add(id);
                return "User added to table!";
            }
        }
    }
}
