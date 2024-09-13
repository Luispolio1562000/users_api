package com.qrsof.users_api.services;


import com.qrsof.users_api.dao.PermissionsDao;
import com.qrsof.users_api.models.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PermissionsService {
    @Autowired
    PermissionsDao permissionsDao;
    public List<Permission> getAll() {
        return permissionsDao.getAll();
    }

    public Permission get(long id) {
        return permissionsDao.get(id);
    }

    public Permission register(Permission permissions) {
        return permissionsDao.register(permissions);
    }

    public Permission update(@RequestBody Permission permissions) {
        return permissionsDao.update(permissions);
    }

    public void delete(@PathVariable long id) {
        permissionsDao.delete(id);
    }
}
