package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.UserDao;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserDetailServices implements UserDetailsService {
    private final UserDao userDao;

    public UserDetailServices(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User auth = userDao.showEmail(username);
        org.hibernate.Hibernate.initialize(auth.getRoles());
        return new org.springframework.security.core.userdetails.User(auth.getEmail(),auth.getPassword(),
                roleAuth(auth.getRoles()));
    }

    private Collection<? extends GrantedAuthority> roleAuth(Set<Role> roles){
        return roles.stream().map(r-> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
    }
}
