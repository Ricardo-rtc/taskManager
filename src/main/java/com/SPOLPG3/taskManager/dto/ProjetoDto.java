package com.SPOLPG3.taskManager.dto;

import jakarta.validation.constraints.NotBlank;

public record ProjetoDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,
        @NotBlank(message = "A descrição é obrigatória")
        String descricao
) {
}