package com.akbar.redfita.repositiory;


import com.akbar.redfita.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {


    List<UserEntity> findAll();

    UserEntity findUserById(long id);

    void createUser(UserEntity entity);


}
