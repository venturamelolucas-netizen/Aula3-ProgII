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
@Table(name = Categoria.TABLE_NAME)
public class Categoria {
    public static final String TABLE_NAME = "categorias";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "category_id", unique = true)
    private Long category_id;

    @Column(name = "categoryname", length = 100, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String categoryname;

    @Column(name = "descricao", length = 500, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String descricao;
}
