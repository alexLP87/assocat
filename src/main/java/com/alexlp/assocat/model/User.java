package com.alexlp.assocat.model;


import com.alexlp.assocat.security.ApplicationUserRole;
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

    @Column(name = "username")
    @NotBlank
    private String username;

    @Column(name = "name")
    @NotBlank
    private String name;

    @Column(name = "firstname")
    @NotBlank
    private String firstName;

    @Column(name = "role")
    @NotBlank
    private ApplicationUserRole role;

    @Column(name = "password")
    @NotBlank
    private String password;

    @Column(name = "enabled")
    @NotBlank
    private boolean enabled;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ApplicationUserRole getRole() {
        return role;
    }

    public void setRole(ApplicationUserRole role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
