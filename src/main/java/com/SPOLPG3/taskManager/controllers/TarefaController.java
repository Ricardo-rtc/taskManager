package com.SPOLPG3.taskManager.controllers;

import com.SPOLPG3.taskManager.dto.TarefaDto;
import com.SPOLPG3.taskManager.models.Tarefa;
import com.SPOLPG3.taskManager.services.TarefaService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaService tarefaService;

    @Autowired
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping("/findAll")
    public List<Tarefa> findAll()  {
        return tarefaService.findAll();
    }

    @GetMapping("/findById/{usuarioId}")
    public Tarefa findById(@RequestParam Integer usuarioId) throws Exception {
        return tarefaService.findById(usuarioId);
    }

    @PostMapping("/create")
    public Tarefa create(@RequestBody @Valid TarefaDto tarefaDto) {
        return tarefaService.create(tarefaDto);
    }
}