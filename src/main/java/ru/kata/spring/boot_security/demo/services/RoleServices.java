package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleServices {
    List<Role> listRole();

    Role getIdRole(int id);

    Role getName(String name);

    void save(Role role);
}
