package com.alexlp.assocat.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Cat {

    private final UUID id;

    @NotBlank
    private final String name;

    private final Race race;

    public Cat(@JsonProperty("id") UUID id,
               @JsonProperty("name") String name,
               @JsonProperty("race") Race race) {
        this.id = id;
        this.name = name;
        this.race = race;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }
}
