package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void isAnagram() {
        assertEquals(true , App.isAnagram("Test this", "Test this"));
        assertEquals(false, App.isAnagram("note", "cone"));

    }
}