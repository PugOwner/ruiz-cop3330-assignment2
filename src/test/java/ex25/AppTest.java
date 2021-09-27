package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator() {
        /*
        * 1 signifies a very weak password
        * 2 signifies a weak password
        * 3 signifies a strong password
        * 4 signifies a very strong password
        */
        assertEquals(1,App.passwordValidator("1234567"));
        assertEquals(2,App.passwordValidator("Letters"));
        assertEquals(3,App.passwordValidator("Letters1"));
        assertEquals(3,App.passwordValidator("Letters0"));
        assertEquals(3,App.passwordValidator("MoreLetters01"));
        assertEquals(4,App.passwordValidator("MoreLetters01*"));
        assertEquals(4,App.passwordValidator("MoreLetters0101**&&^^%%$$##@@"));
    }
}