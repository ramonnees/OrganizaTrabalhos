package com.example.organizatrabalhos.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tb_disciplina")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cor; // String para aceitar formato Hexa

    // Relacionamento: Muitas disciplinas pertencem a um Usuário
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User usuario;
}


