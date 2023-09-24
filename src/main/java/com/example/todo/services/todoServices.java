package com.example.todo.services;

import com.example.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class todoServices {

static Logger logger = LoggerFactory.getLogger(todoServices.class);
    static List<Todo>  todos  = new ArrayList<>();
    public static Todo createTodo(Todo todo) {
        todos.add(todo);
        logger.info("Todos {}", todos);

        return todo;
    }

  
}
