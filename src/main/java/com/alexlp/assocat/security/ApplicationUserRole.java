package com.alexlp.assocat.security;

import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.Set;

import static com.alexlp.assocat.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(USER_READ,USER_WRITE,CAT_READ,CAT_WRITE)),
    MEMBER(Sets.newHashSet(USER_READ,CAT_READ,CAT_WRITE));

    private final Set<ApplicationUserPermission> permissions;


     ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
