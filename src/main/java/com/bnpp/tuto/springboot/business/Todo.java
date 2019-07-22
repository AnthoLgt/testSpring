package com.bnpp.tuto.springboot.business;

public class Todo {

    private Integer id ;
    private String message;

    public Todo(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId(){
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

}
