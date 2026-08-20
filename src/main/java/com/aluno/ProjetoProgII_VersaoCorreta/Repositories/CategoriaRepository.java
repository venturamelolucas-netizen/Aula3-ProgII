package com.aluno.ProjetoProgII_VersaoCorreta.Repositories;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}