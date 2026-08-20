package com.aluno.ProjetoProgII_VersaoCorreta.Models;

import com.aluno.ProjetoProgII_VersaoCorreta.Models.User.CreateUser;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = Livro.TABLE_NAME)
public class Livro {
    public static final String TABLE_NAME = "livros";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "bookname", length = 100, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String bookname;

    @Column(name = "ISBN", length = 13, nullable = false, unique = true)
    @NotNull(groups = CreateUser.class)
    private String ISBN;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "author_id", nullable = false)
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "editor_id", referencedColumnName = "editor_id", nullable = false)
    private Editora editora;

}
