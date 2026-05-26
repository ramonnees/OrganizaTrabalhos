package com.example.organizatrabalhos.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "tb_trabalho")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataEntrega;
    private Boolean finalizado = false;
    private Float nota;

    // Relacionamento: Muitos trabalhos pertencem a um Usuário
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User usuario;

    // Relacionamento: Muitos trabalhos pertencem a uma Disciplina
    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;
}