package com.example.organizatrabalhos.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity // Diz ao Spring que isso é uma tabela no banco
@Table(name = "tb_user")
@Data // O Lombok gera automaticamente todos os getters, setters, construtores invisivel
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID Auto-incremental
    private Long id;

    private String nome;

    @Column(unique = true) // Garante que não existam e-mails duplicados
    private String email;

    private String senhaHash;
}