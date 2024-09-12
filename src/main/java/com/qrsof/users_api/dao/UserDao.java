package com.qrsof.users_api.dao;

import com.qrsof.users_api.models.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Date;
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

    User deleteUser(Long id);
}
