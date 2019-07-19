package com.bnpp.tuto.springboot.service;

import com.bnpp.tuto.springboot.business.Todo;
import com.bnpp.tuto.springboot.persistence.ITodoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private ITodoDAO dao;

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
