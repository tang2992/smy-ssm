package com.smy.chapter3.repository;

import com.smy.chapter3.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserRepositoryImpl implements UserRepository {

    @Override
    public User saveUser(Long id) {
        log.debug("Saving user...");
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public User getUser(Long id) {
        log.debug("Retrieving user...");
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        log.debug("Deleting user...");
        // delete user
    }
}