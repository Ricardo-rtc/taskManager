package com.SPOLPG3.taskManager.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.SPOLPG3.taskManager.dto.CategoriaDto;
import com.SPOLPG3.taskManager.dto.ProjetoDto;
import com.SPOLPG3.taskManager.repositories.CategoriaRepository;
import com.SPOLPG3.taskManager.repositories.ProjetoRepository;
import com.SPOLPG3.taskManager.models.Categoria;
import com.SPOLPG3.taskManager.models.Projeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class ProjetoService {
    private final ProjetoRepository projetoRepository;

    @Autowired
    public ProjetoService(ProjetoRepository categoriaJpaRepository) {
        this.projetoRepository = categoriaJpaRepository;
    }

    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    public Projeto findById(Integer projetoId) throws Exception {
        return projetoRepository.findById(projetoId).orElseThrow(() -> new Exception("Projeto não encontrado"));
    }

    public Projeto create(ProjetoDto projetoDto) {
        Projeto projeto = new Projeto();
        projeto.setNome(projetoDto.nome());
        projeto.setDescricao(projetoDto.descricao());
        return projetoRepository.save(projeto);
    }

}