package com.alexlp.assocat.dao;


import com.alexlp.assocat.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgrecat")
public class CatDataAccessService implements CatDao{

    //jdbc injection
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CatDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //TODO implements query sql cat access service
    @Override
    public int insertCat(UUID id, Cat cat) {
        return 0;
    }

    @Override
    public List<Cat> selectAllCats() {
        return null;
    }

    @Override
    public Optional<Cat> selectCatById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteCatById(UUID id) {
        return 0;
    }

    @Override
    public int updateCatById(UUID id, Cat cat) {
        return 0;
    }
}
