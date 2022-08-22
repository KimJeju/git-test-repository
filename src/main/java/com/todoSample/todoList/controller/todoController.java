package com.todoSample.todoList.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class todoController {

    @GetMapping("/")
    public String index(){
        return "To-Do Application : Be-39-김건휘";
    }
}
