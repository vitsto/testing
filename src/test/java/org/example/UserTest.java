package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    @DisplayName("When login and email are passed to constructor then object initialize fields these values")
    void allArgsConstructorTest() {
        User testUser = new User("test", "test@mail.ru");
        String actualLogin = testUser.getLogin();
        String actualEmail = testUser.getEmail();
        assertAll("Should return correct login and email of User",
                () -> assertEquals("test", testUser.getLogin()),
                () -> assertEquals("test@mail.ru", testUser.getEmail()));
    }

    @Test
    @DisplayName("When login and email are not passed to constructor then object initialize fields empty strings")
    void noArgsConstructorTest() {
        User testUser = new User();
        String actualLogin = testUser.getLogin();
        String actualEmail = testUser.getEmail();
        assertAll("Should return correct login and email of User",
                () -> assertEquals("", testUser.getLogin()),
                () -> assertEquals("", testUser.getEmail()));
    }

    @Test
    @DisplayName("Validating User's email")
    void validEmailTest() {
        User testUser = new User("test", "test@mail.ru");
        String actualEmail = testUser.getEmail();
        assertAll("Should return valid User's email",
                () -> assertTrue(actualEmail.contains(".")),
                () -> assertTrue(actualEmail.contains("@")));
    }

    @Test
    @DisplayName("Checking User's email and login for equality ")
    void areLoginAndEmailEqualTest() {
        User testUser = new User("test", "test@mail.ru");
        assertNotEquals(testUser.getEmail(), testUser.getLogin());
    }
}
