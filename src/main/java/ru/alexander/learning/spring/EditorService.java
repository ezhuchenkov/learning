package ru.alexander.learning.spring;

import java.util.Set;

public class EditorService {

    private final UserService userService;

    public EditorService(UserService userService) {
        this.userService = userService;
    }

    public void edit(int userId, String newValue) {
        Set<String> privileges = userService.getPrivileges(userId);
        if (privileges.contains("write")) {
            System.out.println("value saved: " + newValue);
        } else {
            System.out.println("No permissions for user " + userId);
        }
    }

}
