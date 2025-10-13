package com.SPOLPG3.taskManager.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "projeto")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjeto;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(length = 500)
    private String descricao;
}
