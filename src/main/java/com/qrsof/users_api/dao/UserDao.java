package com.qrsof.users_api.dao;

import com.qrsof.users_api.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface UserDao {
    List<User> getAllUsers();

    //Obtener usuario
    User getUserById(Long id);


    //Registrar usuario
    User registerUser(User user);

    //Actualizar usuario
    User updateUser(User user);

    //Eliminar usuario
    void deleteUser(Long id);
    public User login(User user);
}
