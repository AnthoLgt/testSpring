package com.bnpp.tuto.springboot.controller;

import com.bnpp.tuto.springboot.business.Greeting;
import com.bnpp.tuto.springboot.business.Todo;
import com.bnpp.tuto.springboot.persistence.ITodoDAO;
import com.bnpp.tuto.springboot.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TodoController {

    private TodoService todoService;

    public TodoController(){
        this.todoService = new TodoService();
    }

    @RequestMapping("/todos")
    public List<Todo> todos() {
        return this.todoService.getTodos();
    }

    @RequestMapping("/todo/{id}")
    public Todo todoById(@PathVariable("id") Integer id) {
        return  this.todoService.getTodoById(id);
    }

    @PostMapping("/todo")
    public Integer todoById(@RequestBody Todo todo) {
        return this.todoService.insertTodo(todo);
    }

    @PutMapping("/todo/{id}")
    public void updateToDo(@RequestBody Todo todo, @PathVariable("id") Integer id) {
        this.todoService.updateTodo(todo);
    }
}
