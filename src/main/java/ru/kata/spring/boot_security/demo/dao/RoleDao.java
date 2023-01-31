package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> listRole();

    Role getRoleId(int id);

    Role getName(String name);

    void save(Role role);
}
