package com.aluno.ProjetoProgII_VersaoCorreta.Repositories;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}