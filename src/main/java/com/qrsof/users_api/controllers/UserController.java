package com.qrsof.users_api.controllers;


import com.qrsof.users_api.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        // Crear usuarios y agregarlos a la lista
        users.add(new User(102L, "Juan", "Pérez", "juan.perez@example.com", "555-1234", new Date()));
        users.add(new User(101L, "María", "García", "maria.garcia@example.com", "555-5678", new Date()));
        users.add(new User(100L, "Carlos", "López", "carlos.lopez@example.com", "555-8765", new Date()));
        return users;
    }

    //Obtener usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getUserById(@PathVariable Long id) {
        User user = new User();
        user.setId(103L);
        user.setName("Juan");
        user.setLastName("Perez");
        user.setEmail("juan@example.com");
        user.setPhone("555-1234");
        return user;
    }


    //Registrar usuario


    @RequestMapping(value = "/", method = RequestMethod.POST)
    User registerUser(@RequestBody User user) {
        //TODO: Registrar en la BD
        return user;


    }

    //Actualizar usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User updateUser(@RequestBody User user) {
        //TODO: Actualizar en la BD
        return user;
    }

    //Eliminar usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    User deleteUser(@PathVariable Long id) {
        //TODO Eliminar de la BD
        return null;
    }


}


