package com.SPOLPG3.taskManager.controllers;

import com.SPOLPG3.taskManager.dto.CategoriaDto;
import com.SPOLPG3.taskManager.models.Categoria;
import com.SPOLPG3.taskManager.services.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/findAll")
    public List<Categoria> findAll()  {
        return categoriaService.findAll();
    }

    @GetMapping("/findByName/{categoriaId}")
    public Categoria findById(@RequestParam Integer categoriaId) throws Exception {
        return categoriaService.findById(categoriaId);
    }

    @PostMapping("/create")
    public Categoria create(@RequestBody @Valid CategoriaDto categoria) {
        return categoriaService.create(categoria);
    }
}