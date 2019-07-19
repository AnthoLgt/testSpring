package com.bnpp.tuto.springboot.persistence;

import com.bnpp.tuto.springboot.business.Todo;
import java.util.List;

public interface ITodoDAO {

    List<Todo> getTodos();

    Todo getTodoById(Integer id);

    Integer insertTodo(Todo todo);

    void updateTodo(Todo todo);

}
