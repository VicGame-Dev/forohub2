package com.challenge3.forohub2.domain.dto;
import com.challenge3.forohub2.domain.model.Topico;


public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        //Boolean status,
        String autor,
        String curso
) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getAutor(), topico.getCurso());

    }

}
