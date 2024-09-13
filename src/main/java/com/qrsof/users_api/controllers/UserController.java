package com.qrsof.users_api.controllers;


import com.qrsof.users_api.models.User;
import com.qrsof.users_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.qrsof.users_api.utils.JWTUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("users")
public class UserController {
@Autowired
private UserService userService;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    List<User> getAllUsers() {
        return userService.getAllUsers();

    }

    //Obtener usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }


    //Registrar usuario
    @RequestMapping(value = "/", method = RequestMethod.POST)
    void registerUser(@RequestBody User user) {
        userService.registerUser(user);
    }

    //Actualizar usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    User updateUser(@RequestBody User user) {
    userService.updateUser(user);
        return user;
    }

    //Eliminar usuario
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void deleteUser(@PathVariable Long id) {
       userService.deleteUser(id);

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    Map<String, Object> login(@RequestBody User dto) {
        User user = userService.login(dto);

        Map<String, Object> result = new HashMap<>();
        if (user != null) {
            String token = jwtUtil.create(String.valueOf(user.getId()), user.getEmail());
            result.put("token", token);
            result.put("user", user);
        }
        return result;
    }





}


