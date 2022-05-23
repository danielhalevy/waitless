package com.gratitude.gil.controllers;

import com.gratitude.gil.model.Table;
import com.gratitude.gil.service.TableService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tables")
public class TableController {


    public final TableService ts;

    @GetMapping()
    public List<Table> getAll() {
        return ts.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Table> getTable(@PathVariable String id) {
        return ts.getTableById(id);
    }

    @PostMapping()
    public Table createTable(@RequestBody Table table) {
        return ts.createTable(table);
    }

    @PostMapping("/{id}")
    public Table updateTable(@RequestBody Table table) {
        return ts.updateTable(table);
    }

    @PostMapping("/{id}/{uid}")
    public String addUserToTable(@PathVariable String id, @PathVariable String uid) {
        return ts.updateTableUsers(id, uid);
    }

    @DeleteMapping()
    public void deleteTable(@RequestBody Table table) {
        ts.deleteTable(table);
    }

    @DeleteMapping("/{id}")
    public void deleteTable(@PathVariable String id) {
        ts.deleteTableById(id);
    }

}
