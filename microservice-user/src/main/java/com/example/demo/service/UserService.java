package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User create(User user);

    User update(User user);

    void delete(Integer id);
}
