package ru.alexander.learning.mocking;

public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean loggedInToday(int userId) {
        long lastLoginTime = userDao.getLastLoginTime(userId);
        return System.currentTimeMillis() - lastLoginTime <= 24 * 60 * 60 * 1000;
    }

}
