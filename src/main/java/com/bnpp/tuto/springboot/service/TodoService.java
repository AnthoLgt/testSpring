package com.bnpp.tuto.springboot.service;

import com.bnpp.tuto.springboot.business.Todo;
import com.bnpp.tuto.springboot.persistence.ITodoDAO;
import com.bnpp.tuto.springboot.persistence.TodoDAOInMemory;

import java.util.List;

public class TodoService {

    private ITodoDAO dao;

    public TodoService(){
        this.dao = new TodoDAOInMemory();
    }

    public List<Todo> getTodos(){
        return this.dao.getTodos();
    }

    public Todo getTodoById(Integer id){
        return this.dao.getTodoById(id);
    }

    public Integer insertTodo(Todo todo){
        return this.dao.insertTodo(todo);
    }

    public void updateTodo(Todo todo){
        this.dao.updateTodo(todo);
    }

}
