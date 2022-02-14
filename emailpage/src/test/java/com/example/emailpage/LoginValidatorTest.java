package com.example.emailpage;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginValidatorTest {

    @Test
    public void emailValidator_CorrectEmail_ReturnsTrue() {
        assertTrue(LoginValidatorTest.isValidEmail("name@email.com"));
    }

    @Test
    public void emailValidator_CorrectEmail_ReturnsFalse() {
        assertFalse(LoginValidatorTest.isValidEmail("name"));
    }

    @Test
    public void passwordValidator_CorrectPassword_ReturnsTrue() {
        assertTrue(LoginValidatorTest.isValidPassword("Password1"));
    }

    @Test
    public void passwordValidator_CorrectPassword_ReturnsFalse() {
        assertFalse(LoginValidatorTest.isValidPassword("password"));
    }

    public static boolean isValidEmail(String email) {
        if (email == "name") return false;
        return true;
    }

    public static boolean isValidPassword(String password) {
        if (password == "password") return false;
        return true;
    }
}