package com.alexlp.assocat.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class User {

    private final UUID id;

    @NotBlank
    private final String name;
    @NotBlank
    private final String firstName;

    public User(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("firstname") String firstName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }
}
