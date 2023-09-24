package com.example.todo.controller;


import com.example.todo.models.Todo;
import com.example.todo.services.todoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {

Logger logger = LoggerFactory.getLogger(TodoController.class);

@Autowired
private todoServices Todoservices;

@PostMapping
    public Todo  createtodohandler(@RequestBody Todo todo){

       logger.info("Create todo");
       Todo Todo1=  todoServices.createTodo(todo);
       return Todo1;
    }
}
