package com.challenge3.forohub2.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        @NotBlank
        String fechaCreacion,

        @NotNull
        Boolean status,

        @NotBlank
        String autor,

        //Deberia ser un enum, actulizar
        @NotBlank
        String curso
) {
}
