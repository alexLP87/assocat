package com.alexlp.assocat.dao;

import com.alexlp.assocat.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgreuser")
public class UserDataAccessService implements UserDao{
/*
    //inject jdbc connector
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
*/
    @Autowired
    private SessionFactory sessionFactory;

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
        Session session = sessionFactory.getCurrentSession();
        User user;


        try {
            session.beginTransaction();
            user = session.get(User.class, "45214688-3639-11eb-923b-0242ac130002");

            session.getTransaction().commit();
        } finally {
            session.close();
        }

        Optional<User> retour = Optional.ofNullable(user);
        return retour;
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
