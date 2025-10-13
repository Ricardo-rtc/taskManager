package com.SPOLPG3.taskManager.controllers;

import com.SPOLPG3.taskManager.dto.ProjetoDto;
import com.SPOLPG3.taskManager.models.Projeto;
import com.SPOLPG3.taskManager.services.ProjetoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {
    private final ProjetoService projetoService;

    @Autowired
    public ProjetoController(ProjetoService projetoService) {
        this.projetoService = projetoService;
    }

    @GetMapping("/findAll")
    public List<Projeto> findAll()  {
        return projetoService.findAll();
    }

    @GetMapping("/findById/{projetoId}")
    public Projeto findById(@RequestParam Integer usuarioId) throws Exception {
        return projetoService.findById(usuarioId);
    }

    @PostMapping("/create")
    public Projeto create(@RequestBody @Valid ProjetoDto projetoDto) {
        return projetoService.create(projetoDto);
    }
}