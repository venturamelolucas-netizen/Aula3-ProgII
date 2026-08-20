package com.aluno.ProjetoProgII_VersaoCorreta.Models;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.User.CreateUser;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = Autor.TABLE_NAME)
public class Autor {
    public static final String TABLE_NAME = "autores";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "author_id", unique = true)
    private Long author_id;

    @Column(name = "authorname", length = 100, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String authorname;

    @Column(name = "email", nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String email;
    

}
