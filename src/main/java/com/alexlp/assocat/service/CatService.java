package com.alexlp.assocat.service;

import com.alexlp.assocat.dao.CatDao;
import com.alexlp.assocat.model.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CatService {

    private final CatDao catDao;

    @Autowired
    public CatService(@Qualifier("postgrecat") CatDao catDao) {
        this.catDao = catDao;
    }

    public  int addCat(Cat cat){return catDao.insertCat(cat);}

    public List<Cat> getAllCats(){return catDao.selectAllCats();}

    public Optional<Cat> getCatById(UUID id){return catDao.selectCatById(id);}

    public int deleteCatById(UUID id){return catDao.deleteCatById(id);}

    public int updateCatById(UUID id, Cat newCat){return catDao.updateCatById(id,newCat);}

}
