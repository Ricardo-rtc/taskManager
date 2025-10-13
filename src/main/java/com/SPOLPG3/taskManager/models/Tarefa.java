package com.SPOLPG3.taskManager.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTarefa;

    @Column(nullable = false, length = 150)
    private String titulo;

    @Column(length = 500)
    private String descricao;

    // Relacionamentos
    @ManyToOne
    @JoinColumn(name = "idProjeto", nullable = false)
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "idResponsavel", nullable = false)
    private Usuario responsavel;

    @ManyToOne
    @JoinColumn(name = "idCategoria", nullable = false)
    private Categoria categoria;

    // Enums
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Prioridade prioridade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    // Datas
    @Column(nullable = false)
    private LocalDate criacao;

    @Column(nullable = false)
    private LocalDate prazo;
}

