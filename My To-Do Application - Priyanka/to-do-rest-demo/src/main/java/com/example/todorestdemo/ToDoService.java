package com.example.todorestdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepo repository;

    @Autowired
    public ToDoService(ToDoRepo repository) {
        this.repository = repository;
    }

    public List<ToDoItem> getAllToDos() {
        return repository.findAll();
    }

    public ToDoItem saveToDo(ToDoItem newToDo) {
        return repository.save(newToDo);
    }

    public ToDoItem updateToDo(ToDoItem updatedToDo) {
        return repository.save(updatedToDo);
    }

    public void deleteToDo(String id) {
        repository.deleteById(id);
    }
}
