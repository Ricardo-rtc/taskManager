package com.SPOLPG3.taskManager.controllers;

import com.SPOLPG3.taskManager.dto.UsuarioDto;
import com.SPOLPG3.taskManager.models.Usuario;
import com.SPOLPG3.taskManager.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/findAll")
    public Object findAll()  {
        return usuarioService.findAll();
    }

    @GetMapping("/findById/{usuarioId}")
    public Object findById(@RequestParam Integer usuarioId) throws Exception {
        return usuarioService.findById(usuarioId);
    }

    @PostMapping("/create")
    public Usuario create(@RequestBody @Valid UsuarioDto usuarioDto) {
        return usuarioService.create(usuarioDto);
    }
}