package ru.alexander.learning.mocking;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @Test
    public void testLoggedInToday() {
        UserDao userDao = mock(UserDao.class);
        when(userDao.getLastLoginTime(anyInt())).thenReturn(System.currentTimeMillis() - 1000);
        UserService userService = new UserService(userDao);

        UserService userService2 = spy(userService);

        assertTrue(userService2.loggedInToday(1));
    }


    /*
    @Test
    public void testLoggedInToday() {
        UserDaoMock userDao = new UserDaoMock(System.currentTimeMillis() - 1000);
        UserService userService = new UserService(userDao);
        assertTrue(userService.loggedInToday(1));
    }

    private static class UserDaoMock extends UserDao {

        private final long lastLoginTime;

        private UserDaoMock(long lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        @Override
        public long getLastLoginTime(int id) {
            return lastLoginTime;
        }
    }
    */
}
