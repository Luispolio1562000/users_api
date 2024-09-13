package com.qrsof.users_api.dao;

import com.qrsof.users_api.models.Permission;

import java.util.List;

public interface PermissionsDao {
    List<Permission> getAll();
    Permission get(long id);
    Permission register(Permission permissions);
    Permission update(Permission permissions);
    void delete(long id);
}
