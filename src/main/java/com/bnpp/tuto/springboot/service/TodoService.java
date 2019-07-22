package com.bnpp.tuto.springboot.service;

import com.bnpp.tuto.springboot.business.Todo;
import com.bnpp.tuto.springboot.persistance.TodoDAOInMemory;

import java.util.List;

public class TodoService {

    private TodoDAOInMemory todoDAOInMemory = new TodoDAOInMemory();

    public List<Todo> getTodoList() {
            return todoDAOInMemory.getTodoList();
    }
    public Todo getTodoById(Integer id) {
        return todoDAOInMemory.getTodoById(id);
    }
    public void createTodo(Todo todo) {
         todoDAOInMemory.insertTodo(todo);

    }
}
