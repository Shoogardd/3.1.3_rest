package com.example.rest.service;

import com.example.rest.model.Role;
import com.example.rest.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    User findUserByFirstName(String firstName);
    void updateUser(User user);
    void deleteById(Long id);
    User getByEmail(String email);
    User getUserByName(String name);
    User getUserByEmail(String email);
    User getUserById(Long id);
    List<User> getAllUsers();
    Role getRole(String name);
    List<Role> getAllRoles();
}
