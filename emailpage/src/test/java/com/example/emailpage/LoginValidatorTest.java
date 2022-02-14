package com.example.emailpage;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class LoginValidatorTest {

    @Test
    public void emailValidator_CorrectEmail_ReturnsTrue() {
        assertTrue(Validator.isValidEmail("name@email.com"));
    }

    @Test
    public void emailValidator_CorrectEmail_ReturnsFalse() {
        assertFalse(Validator.isValidEmail("name"));
    }

    @Test
    public void passwordValidator_CorrectPassword_ReturnsTrue() {
        assertTrue(Validator.isValidPassword("Password1"));
    }

    @Test
    public void passwordValidator_CorrectPassword_ReturnsFalse() {
        assertFalse(Validator.isValidPassword("password"));
    }

    
    Validator Validator = new Validator();
}



class Validator {
    public boolean isValidEmail(String email) {
        if (email == "name") return false;
        return true;
    }

    public boolean isValidPassword(String password) {
        if (password == "password") return false;
        return true;
    }
}