package com.SPOLPG3.taskManager.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.SPOLPG3.taskManager.dto.CategoriaDto;
import com.SPOLPG3.taskManager.repositories.CategoriaRepository;
import com.SPOLPG3.taskManager.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Integer categoriaId) throws Exception {
        return categoriaRepository.findById(categoriaId).orElseThrow(() -> new Exception("Categoria não encontrada"));
    }

    public Categoria create(CategoriaDto categoriaDto) {
        Categoria categoria = new Categoria();
        categoria.setNome(categoriaDto.nome());
        return categoriaRepository.save(categoria);
    }

}