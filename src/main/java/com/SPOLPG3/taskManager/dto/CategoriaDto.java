package com.SPOLPG3.taskManager.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome
) {
}
