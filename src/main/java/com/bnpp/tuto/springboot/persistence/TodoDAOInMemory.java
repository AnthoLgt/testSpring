package com.bnpp.tuto.springboot.persistence;

import com.bnpp.tuto.springboot.business.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class TodoDAOInMemory implements ITodoDAO{

    private final Map<Integer, Todo> todoInMemory;

    public TodoDAOInMemory(){
        this.todoInMemory = new HashMap<>();
        this.todoInMemory.putIfAbsent(1,new Todo(1, "Test"));
        this.todoInMemory.putIfAbsent(2,new Todo(2, "Test2"));
    }

    @Override
    public List<Todo> getTodos() {
        return new ArrayList<Todo>(this.todoInMemory.values());
    }

    @Override
    public Todo getTodoById(Integer idTodo) {
        return this.todoInMemory.get(idTodo);
    }

    @Override
    public Integer insertTodo(Todo todo) {
        this.todoInMemory.putIfAbsent(todo.getId(), todo);
        return todo.getId();
    }

    @Override
    public void updateTodo(Todo todo) {
        this.todoInMemory.replace(todo.getId(), todo);
    }
}
