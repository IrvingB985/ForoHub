package com.alura.ForoHub.repository;

import com.alura.ForoHub.Models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
}