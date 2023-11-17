package com.example.RestAPIStringExample.services;


import com.example.RestAPIStringExample.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getOneUser(Long id);

    void deleteUserById(Long id);

    void save(User user);

    void updateUser(User user);

}
