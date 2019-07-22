package com.bnpp.tuto.springboot.persistance;

import com.bnpp.tuto.springboot.business.Todo;

import java.util.List;

public interface ITodoDAO {

    List<Todo> getTodoList() ;

    Todo getTodoById(Integer idTodo);

    Integer insertTodo(Todo todo);

    void updateTodo(Todo todo);

 }
