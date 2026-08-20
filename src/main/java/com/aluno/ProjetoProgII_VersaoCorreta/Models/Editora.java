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
@Table(name = Editora.TABLE_NAME)
public class Editora {
    public static final String TABLE_NAME = "editoras";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "editor_id", unique = true)
    private Long editor_id;

    @Column(name = "editorname", length = 100, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String editorname;

    @Column(name = "endereco", length = 300, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String endereco;
}
