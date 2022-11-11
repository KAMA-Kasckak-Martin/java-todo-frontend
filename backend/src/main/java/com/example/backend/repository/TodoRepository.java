package com.example.backend.repository;


import com.example.backend.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepository {

    private List<Todo> todos;

    public TodoRepository(List<Todo> todos) {
        this.todos = todos;
    }

    public List<Todo> getAllTodos(){
        return todos;
    }

    public Todo addTodo(Todo newTodo){
        this.todos.add(newTodo);
        return newTodo;
    }

    public Todo getById(String id){
        for (Todo todo: todos){
            if (todo.id().equals(id)){
                return todo;
            }
        }
        return null;
    }

    public Todo editTodo (String id, Todo todo){
        int indefOf= this.todos.indexOf(getById(id));
        this.todos.set(indefOf,todo);
        return todo;
    }

    public String deleteTodo(String id){
        this.todos.remove(getById(id));
        return id;
    }



}
