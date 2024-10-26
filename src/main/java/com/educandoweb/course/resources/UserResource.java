package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que a classe é um controlador que reponde requisições REST.
@RequestMapping(value = "/users") // Usada para mapear requisições HTTP para metodos especificos.
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "11949136870", "12345");
        return ResponseEntity.ok().body(u);
    }
}
