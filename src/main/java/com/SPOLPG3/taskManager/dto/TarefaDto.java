package com.SPOLPG3.taskManager.dto;

import jakarta.validation.constraints.*;

public record TarefaDto(
        @NotBlank(message = "O título é obrigatório")
        String titulo,
        @NotBlank(message = "A descrição é obrigatória")
        String descricao,
        @NotBlank(message = "O prazo é obrigatório")
        String prazo,
        @Min(value = 1, message = "A prioridade mínima é 1")
        @Max(value = 5, message = "A prioridade máxima é 5")
        Integer prioridade,
        @NotNull(message = "O ID do projeto é obrigatório")
        Integer projetoId,
        @NotNull(message = "O ID da categoria é obrigatório")
        Integer categoriaId,
        @NotNull(message = "O ID do usuário é obrigatório")
        Integer usuarioId
) {
}