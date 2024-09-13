package com.qrsof.users_api.dao.impl;

import com.qrsof.users_api.dao.PermissionsDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import com.qrsof.users_api.models.Permission;


import java.util.List;

@Transactional
@Repository
public class PermissionsDaoImpl implements PermissionsDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Permission> getAll() {
        String hql = "FROM Permission as u ";
        return (List<Permission>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Permission get(long id) {
        return entityManager.find(Permission.class, id);
    }

    @Override
    public Permission register(Permission permissions) {
        entityManager.merge(permissions);
        return permissions;
    }

    @Override
    public Permission update(Permission permissions) {
        entityManager.merge(permissions);
        return permissions;
    }

    @Override
    public void delete(long id) {
        Permission permission = get(id);
        entityManager.remove(permission);
    }


}
