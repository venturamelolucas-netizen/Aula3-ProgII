package com.aluno.ProjetoProgII_VersaoCorreta.Repositories;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}