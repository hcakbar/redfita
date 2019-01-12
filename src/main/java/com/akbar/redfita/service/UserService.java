package com.akbar.redfita.service;

import com.akbar.redfita.domain.entity.UserEntity;

import java.util.List;

public interface UserService {


    List<UserEntity> findAll();

    UserEntity findById(long id);

    void addUser(UserEntity entity);


}
