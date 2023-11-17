package com.example.RestAPIStringExample.services;

import com.example.RestAPIStringExample.model.User;
import com.example.RestAPIStringExample.repositories.UserRepository;
import com.example.RestAPIStringExample.util.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getOneUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(UserException::new);

    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public void save(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }
}
