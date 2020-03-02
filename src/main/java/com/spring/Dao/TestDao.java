package com.spring.Dao;

import com.spring.entity.User;

import java.util.List;

public interface TestDao {
    public List<User> findUserByName(User user);
}
