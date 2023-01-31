package ru.kata.spring.boot_security.demo.services;

import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserServices {
    @Transactional(readOnly = true)
    List<User> listUsers();

    @Transactional(readOnly = true)
    User getEmail(String email);

    @Transactional
    void update(int id, User user);

    @Transactional
    User save(User user);

    @Transactional(readOnly = true)
    User getUserById(int id);

    @Transactional
    void delete(int id);
}
