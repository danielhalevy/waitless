package com.gratitude.gil.service;

import com.gratitude.gil.model.Table;
import com.gratitude.gil.repos.TableRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TableService {

    private final TableRepo tr;

    public Table createTable(Table table) {
        return tr.save(table);
    }

    public Optional<Table> getTableById(String id){
        if(tr.findById(id).isPresent())
            return tr.findById(id);
        return Optional.empty();
    }

    public List<Table> getAll() {
        return tr.findAll();
    }

    public Table updateTable(Table table){
        if(tr.findById(table.getId()).isPresent())
            return tr.save(table);
        return null;
    }

    public String updateTableUsers(String id,String userId){
        if(tr.findById(id).isPresent())
            return tr.findById(id).get().addUser(id);
        return "This table does not exist!";
    }


    public void deleteTable(Table table){
        if(tr.findById(table.getId()).isPresent())
            tr.delete(table);
    }

    public void deleteTableById(String id){
        if(tr.findById(id).isPresent())
            tr.deleteById(id);
    }

}
