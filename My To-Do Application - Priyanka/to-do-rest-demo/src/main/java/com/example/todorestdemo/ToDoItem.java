package com.example.todorestdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 * A entity class for the REST and Relational Mapping to the Database.
 */
public class ToDoItem {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean completed;

    //Default constructor for use by the REST controller
    public ToDoItem() {}

    /**
     * A parameterised constructor for use when testing
     */
    public ToDoItem(String description, boolean completed) {
        setDescription(description);
        setCompleted(completed);
    }
}