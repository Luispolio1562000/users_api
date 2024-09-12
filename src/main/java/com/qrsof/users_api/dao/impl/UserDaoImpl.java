package com.qrsof.users_api.dao.impl;

import com.qrsof.users_api.dao.UserDao;
import com.qrsof.users_api.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class UserDaoImpl implements UserDao {



    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Long id) {
      return entityManager.find(User.class, id);
    }

    @Override
    public User registerUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        User user = getUserById(id);
        entityManager.remove(user);
    }
}
