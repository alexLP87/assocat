package com.alexlp.assocat.dao;

import com.alexlp.assocat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgreuser")
public class UserDataAccessService implements UserDao{

    //inject jdbc connector
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //TODO implement database query UserDataService
    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }
}
