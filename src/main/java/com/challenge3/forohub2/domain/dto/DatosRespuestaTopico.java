package com.challenge3.forohub2.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRespuestaTopico(
        Long id,

        String titulo,

        String mensaje,

        String fechaCreacion,

        Boolean status,

        String autor,

        String curso
) {

}
