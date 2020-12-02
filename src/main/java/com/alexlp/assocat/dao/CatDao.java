package com.alexlp.assocat.dao;

import com.alexlp.assocat.model.Cat;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CatDao {

    int insertCat(UUID id, Cat cat);

    default int  insertCat(Cat cat){
        UUID id = UUID.randomUUID();
        return insertCat(id, cat);
    }

    List<Cat> selectAllCats();

    Optional<Cat> selectCatById(UUID id);

    int deleteCatById(UUID id);

    int updateCatById(UUID id, Cat cat);
}
