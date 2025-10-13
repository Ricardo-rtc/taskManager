package com.SPOLPG3.taskManager.repositories;

import com.SPOLPG3.taskManager.models.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> { }