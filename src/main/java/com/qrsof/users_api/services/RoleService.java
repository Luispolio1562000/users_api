package com.qrsof.users_api.services;


import com.qrsof.users_api.dao.RoleDao;
import com.qrsof.users_api.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleDao roleDao;
    public List<Role> getAll() {
        return roleDao.getAll();
    }

    public Role get(long id) {
        return roleDao.get(id);
    }

    public Role register(Role role) {
        return roleDao.register(role);
    }

    public Role update(@RequestBody Role role) {
        return roleDao.update(role);
    }

    public void delete(@PathVariable long id) {
        roleDao.delete(id);
    }
}
