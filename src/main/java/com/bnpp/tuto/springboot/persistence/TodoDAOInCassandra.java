package com.bnpp.tuto.springboot.persistence;

import com.bnpp.tuto.springboot.business.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Service
public class TodoDAOInCassandra implements ITodoDAO{

    private final Map<Integer, Todo> todoInMemory;

    public TodoDAOInCassandra(){
        this.todoInMemory = new HashMap<>();
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

    private void createTable(){

    }
}
