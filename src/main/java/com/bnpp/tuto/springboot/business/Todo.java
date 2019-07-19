package com.bnpp.tuto.springboot.business;

public class Todo {
    private Integer id;
    private String content;

    public Todo(Integer id, String content){
        this.id = id;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public void setContent(String content){
        this.content = content;
    }
}
