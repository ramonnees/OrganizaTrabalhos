package com.example.organizatrabalhos.controller;

import com.example.organizatrabalhos.models.User;
import com.example.organizatrabalhos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Rota para listar todos os utilizadores: http://localhost:8080/users
    @GetMapping
    public List<User> listAll() {
        return userRepository.findAll();
    }

    // Rota real para criar qualquer usuário via payload JSON
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
    // Uma rota rápida de teste para criar um utilizador diretamente pelo navegador!

}