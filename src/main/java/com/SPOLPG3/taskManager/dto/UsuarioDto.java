package com.SPOLPG3.taskManager.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record UsuarioDto(
        @NotBlank(message = "O nome é obrigatório")
        String nome,
        @NotBlank(message = "A data de nascimento é obrigatória")
        Date dataNascimento,
        @Email(message = "Email inválido")
        @NotBlank(message = "O email é obrigatório")
        String email
) {
}