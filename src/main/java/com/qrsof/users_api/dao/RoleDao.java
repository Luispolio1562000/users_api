package com.qrsof.users_api.dao;

import com.qrsof.users_api.models.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAll();
    Role get(long id);
    Role register(Role role);
    Role update(Role role);
    void delete(long id);
}
