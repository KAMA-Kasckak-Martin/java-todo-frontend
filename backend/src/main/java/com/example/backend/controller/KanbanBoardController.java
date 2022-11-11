package com.example.backend.controller;


import com.example.backend.model.Todo;
import com.example.backend.service.KanbanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
