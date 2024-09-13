package com.qrsof.users_api.controllers;

import com.qrsof.users_api.models.Permission;
import com.qrsof.users_api.services.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("permission")
public class PermissionsController {

    @Autowired
    PermissionsService permissionsService;

    // Trae todos los permisos
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Permission> getAll() {
        return permissionsService.getAll();
    }




    // Trae todos los permisos
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Permission get(@PathVariable long id) {
        return permissionsService.get(id);
    }

    // Registrar permiso
    @RequestMapping(value = "/", method = RequestMethod.POST)
    Permission register(@RequestBody Permission permission) {
        return permissionsService.register(permission);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Permission update(@RequestBody Permission permission) {
        return permissionsService.update(permission);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id) {
        permissionsService.delete(id);
    }










}
