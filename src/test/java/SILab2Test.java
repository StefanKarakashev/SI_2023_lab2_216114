import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;


public class SILab2Test {

    @BeforeAll
    static void beforeAllTest() {
        System.out.println("Before all test");
    }

    public void createUser(String username, String password, String eMail) {

    }

    @Test
    public void testEveryBranch() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null ,null)); // 1
        User user1 = new User(null, "password", "example@test.com");
        List<User> users1 = List.of(user1);
        assertFalse(SILab2.function(user1, users1)); // 2
        User user2 = new User("stefank", "passwor", "example@test.com");
        assertFalse(SILab2.function(user2, users1)); // 3
        User user3 = new User("stefank", "pass word", "example@test.com");
        User user4 = new User("stefan1", "password", "example1@test.com");
        List<User> users2 = List.of(user4);
        assertFalse(SILab2.function(user3, users2)); // 4
        User user5 = new User("stefank", "password!", "example@test.com");
        assertTrue(SILab2.function(user5, users2)); // 5
    }

    @Test
    public void testEveryCondition() {
        User user1 = new User(null, null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user1, null));

        User user2 = new User("stefank", null, null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user2, null));

        User user3 = new User("stefank", "password", null);
        assertThrows(RuntimeException.class, () -> SILab2.function(user3, null));

        User user4 = new User("stefank", "password", "example@test.com");
       assertDoesNotThrow(() -> SILab2.function(user4, List.of(user3)));

        System.out.println("aaaaa");

    }
}
