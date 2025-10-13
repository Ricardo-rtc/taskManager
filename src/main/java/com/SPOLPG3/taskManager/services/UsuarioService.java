package com.SPOLPG3.taskManager.services;

import com.SPOLPG3.taskManager.dto.UsuarioDto;
import com.SPOLPG3.taskManager.repositories.UsuarioRepository;
import com.SPOLPG3.taskManager.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Integer idUsuario) throws Exception {
        return usuarioRepository.findById(idUsuario).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    public Usuario create(UsuarioDto usuarioDto) {
        Usuario usuario = new Usuario();
        return usuarioRepository.save(usuario);
    }
}