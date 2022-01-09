package day01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {
    @Test
    void testGetPassword(){
        User user = new AdminUser("myemail@email.hu","mypassword");

        assertEquals("**********",user.getPassword());
    }

}