package com.bnpp.tuto.springboot.business;

import org.springframework.data.annotation.Id;

public class Todo {

    @Id
    private Integer id;
    private String content;

    public Todo(){

    }

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
