package com.bnpp.tuto.springboot.controller;

import java.util.List;
import com.bnpp.tuto.springboot.business.Todo;
import com.bnpp.tuto.springboot.service.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {
        TodoService todoService = new TodoService();

        @RequestMapping("/todos")
        public List<Todo> todos() {
            return todoService.getTodoList();
        }
        @RequestMapping("/todo")
        public Todo getToToById(@RequestParam("id") int id) {
            return todoService.getTodoById(new Integer(id));
        }
        @PostMapping("/todo")
        public void postTodo(@RequestBody Todo todo) {
            todoService.createTodo(todo);
        }

}
