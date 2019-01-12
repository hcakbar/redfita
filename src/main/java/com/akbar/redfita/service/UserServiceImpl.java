package com.akbar.redfita.service;

import com.akbar.redfita.domain.entity.UserEntity;
import com.akbar.redfita.repositiory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity findById(long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public void addUser(UserEntity entity) {
        userRepository.createUser(entity);
    }


}
