package com.alexlp.assocat.model;


import com.fasterxml.jackson.annotation.JsonProperty;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "firstname")
    @NotBlank
    private String firstName;

    /*
    public User(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("firstname") String firstName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
    }

     */

    public User() {

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

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
