package com.spring.Serviceimpl;

import com.spring.Dao.TestDao;
import com.spring.Service.TestService;
import com.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TestServiceImp implements TestService {
    @Autowired
    private TestDao testDao;
    public List<User> findUserByName(User user) {
        return testDao.findUserByName(user);
    }
}
