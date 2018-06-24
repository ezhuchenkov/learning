package ru.alexander.learning.spring;

import java.util.HashSet;
import java.util.Set;

public class UserService {

    private final boolean canRead;
    private final boolean canWrite;

    public UserService(boolean canRead, boolean canWrite) {
        this.canRead = canRead;
        this.canWrite = canWrite;
    }

    public Set<String> getPrivileges(int id) {
        Set<String> result = new HashSet<>();
        if (canRead) {
            result.add("read");
        }
        if (canWrite) {
            result.add("write");
        }
        return result;
    }

}
