package com.alura.ForoHub.DTO;

import com.alura.ForoHub.Models.Curso;
import com.alura.ForoHub.Models.Topico;

public record DatosListaTopico(Long id, String titulo, String mensaje, Curso curso) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
    }
}
