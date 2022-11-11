package com.example.backend.repository;


import com.example.backend.model.Todo;
import org.springframework.stereotype.Repository;

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
}
