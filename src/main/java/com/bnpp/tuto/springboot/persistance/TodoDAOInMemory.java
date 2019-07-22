package com.bnpp.tuto.springboot.persistance;

import com.bnpp.tuto.springboot.business.Todo;

import java.util.*;

public class TodoDAOInMemory implements ITodoDAO {

    private Map<Integer,Todo> todosById;

    public TodoDAOInMemory() {
        todosById = new HashMap<>();
        todosById.put(1,new Todo(1, "Todo1"));
        todosById.put(2,new Todo(2, "Todo2"));

    }

    @Override
    public List<Todo> getTodoList() {
        return new ArrayList<>(todosById.values());
    }

    @Override
    public Todo getTodoById(Integer idTodo) {
        return todosById.get(idTodo);
    }

    @Override
    public Integer insertTodo(Todo todo) {
        Integer id = todo.getId();
        todosById.put(id, todo);
        return id;
    }

    @Override
    public void updateTodo(Todo todo) {
        todosById.replace(todo.getId(), todo);
    }
}
