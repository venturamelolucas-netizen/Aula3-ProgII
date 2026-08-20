package com.aluno.ProjetoProgII_VersaoCorreta.Repositories;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.Task;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByUserId(Long userId);

}