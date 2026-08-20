package com.aluno.ProjetoProgII_VersaoCorreta.Repositories;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}