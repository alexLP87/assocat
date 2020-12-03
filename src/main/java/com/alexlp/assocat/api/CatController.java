package com.alexlp.assocat.api;

import com.alexlp.assocat.model.Cat;
import com.alexlp.assocat.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/cat")
@RestController
public class CatController {

    private final CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }



    @GetMapping
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }

    @GetMapping(path = "{id}")
    Optional<Cat> getCatById(@PathVariable("id") UUID id){
        return catService.getCatById(id);
    }

    @PostMapping
    public void addCat(@Valid @NotNull @RequestBody Cat cat){
        catService.addCat(cat);
    }

    @PutMapping(path = "{id}")
    public void updateCat(@PathVariable("id") UUID id, @Valid @NotNull @RequestBody Cat catToUpdate){
        catService.updateCatById(id, catToUpdate);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCatById(@PathVariable("id") UUID id){
        catService.deleteCatById(id);
    }
}
