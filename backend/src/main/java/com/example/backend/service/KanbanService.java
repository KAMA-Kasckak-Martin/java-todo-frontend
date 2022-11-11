package com.example.backend.service;

import com.example.backend.model.Todo;
import com.example.backend.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KanbanService {

    private TodoRepository todoRepository;

    public KanbanService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    public List<Todo> getAllTodos(){
        return todoRepository.getAllTodos();
    }

    public Todo addNewTodo(Todo todo){
       int id = getAllTodos().size()+1;
        Todo addId = new Todo(String.valueOf(id),todo.description(),todo.status());
        return todoRepository.addTodo(addId);
    }

    public Todo getById(String id){
        return todoRepository.getById(id);
    }

    public Todo editTodo(String id, Todo todo){
        return todoRepository.editTodo(id, todo);
    }

    public String deleteTodo(String id){
        return todoRepository.deleteTodo(id);
    }


}
