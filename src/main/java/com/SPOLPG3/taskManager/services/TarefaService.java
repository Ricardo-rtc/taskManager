package com.SPOLPG3.taskManager.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.SPOLPG3.taskManager.dto.TarefaDto;
import com.SPOLPG3.taskManager.repositories.TarefaRepository;
import com.SPOLPG3.taskManager.models.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    @Autowired
    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<Tarefa> findAll() {
        return tarefaRepository.findAll();
    }

    public Tarefa findById(Integer tarefaId) throws Exception {
        return tarefaRepository.findById(tarefaId).orElseThrow(() -> new Exception("tarefa não encontrada"));
    }

    public Tarefa create(TarefaDto tarefaDto) {
        Tarefa tarefa = new Tarefa();
        return tarefaRepository.save(tarefa);
    }

}