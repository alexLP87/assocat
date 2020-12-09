package com.alexlp.assocat.security;

public enum ApplicationUserPermission {
    CAT_READ("cat:read"),
    CAT_WRITE("cat:write"),
    USER_READ("user:read"),
    USER_WRITE("user:write");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission=permission;
    }

    public String getPermission() {
        return permission;
    }
}
