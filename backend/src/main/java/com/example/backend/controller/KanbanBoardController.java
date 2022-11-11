package com.example.backend.controller;


import com.example.backend.model.Todo;
import com.example.backend.service.KanbanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KanbanBoardController {

    private KanbanService kanbanService;

    public KanbanBoardController(KanbanService kanbanService) {
        this.kanbanService = kanbanService;
    }

    @GetMapping("/todo")
    public List<Todo> getAllTodos(){
        return kanbanService.getAllTodos();
    }

    @PostMapping("/todo")
    public  Todo addNewTodo(@RequestBody Todo newTodo){
        return kanbanService.addNewTodo(newTodo);
    }

    @GetMapping("/todo/{id}")
    public Todo getById(@PathVariable String id){
        return kanbanService.getById(id);
    }

    @PutMapping("/todo/{id}")
    public Todo editTodo(@PathVariable String id,@RequestBody Todo todo){
        return kanbanService.editTodo(id,todo);
    }

    @DeleteMapping("/todo/{id}")
    public String deleteTodo(@PathVariable String id){
        return kanbanService.deleteTodo(id);
    }

}
