package com.SPOLPG3.taskManager.repositories;

import com.SPOLPG3.taskManager.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> { }