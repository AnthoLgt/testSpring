package com.bnpp.tuto.springboot.persistence;

import com.bnpp.tuto.springboot.business.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoDAODb implements ITodoDAO{

    @Autowired
    private ITodoRepository iTodoRepository;

    @Override
    public List<Todo> getTodos() {
        List list = new ArrayList<Todo>();
        Iterator<Todo> it = this.iTodoRepository.findAll().iterator();
        while(it.hasNext()){
            Todo todo = it.next();
            list.add(todo);
        }
        return list;
    }

    @Override
    public Todo getTodoById(Integer id) {
        return this.iTodoRepository.findById(id).get();
    }

    @Override
    public Integer insertTodo(Todo todo) {
        return this.iTodoRepository.save(todo).getId();
    }

    @Override
    public void updateTodo(Todo todo) {
        this.iTodoRepository.save(todo).getId();
    }
}
