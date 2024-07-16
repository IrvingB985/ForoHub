package com.alura.ForoHub.DTO;

import com.alura.ForoHub.Models.Curso;
import com.alura.ForoHub.Models.Topico;

import java.time.LocalDateTime;

public record DatosDetalleTopico(String titulo, String mensaje, LocalDateTime fechaCreacion, Curso curso) {
    public DatosDetalleTopico(Topico topico) {
        this(topico.getTitulo(),
                topico.getMensaje(),
                topico.getFechaCreacion(),
                topico.getCurso());
    }
}
