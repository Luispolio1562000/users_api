package com.qrsof.users_api.services;

import com.qrsof.users_api.dao.UserDao;
import com.qrsof.users_api.models.User;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {

        return userDao.getAllUsers();

    }

    //Obtener usuario
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }


    //Registrar usuario


    public void registerUser(User user) {
       String hash = generarHash(user.getPassword());
        user.setPassword(hash);
        userDao.registerUser(user);
    }

    //Actualizar usuario

    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    //Eliminar usuario
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }


    private String generarHash(String password) {
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.hash(1, 1024 * 1, 1, password);
    }

    public User login(User user) {
        return userDao.login(user);
    }

}
