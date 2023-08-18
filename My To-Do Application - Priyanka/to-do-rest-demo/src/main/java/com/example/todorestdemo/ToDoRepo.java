package com.example.todorestdemo;
import com.example.todorestdemo.ToDoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * A MongoRepository for the {@link ToDoItem } entity to carry out CRUD operations in a
 * MongoDB database
 */
public interface ToDoRepo extends MongoRepository<ToDoItem, String> {
}

