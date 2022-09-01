package ru.job4j.early;

public class PasswordValidator {

    public static String validate(String password) {
        boolean specialFlag = false;
        boolean digitFlag = false;
        boolean lowerFlag = false;
        boolean upperFlag = false;

        if (password.toLowerCase().contains("qwerty") || password.toLowerCase().contains("12345")
                || password.toLowerCase().contains("password") || password.toLowerCase().contains("admin")
                || password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("Use not an a default password");
        }

        if (password == null) {
            throw new IllegalArgumentException("The password is missing");
        }
        if (password.length() > 32 || password.length() < 8) {
            throw new IllegalArgumentException("Password length does not meet requirements");
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                specialFlag = true;
            }
            if (Character.isDigit(ch)) {
                digitFlag = true;
            }
            if (Character.isLowerCase(ch)) {
                lowerFlag = true;
            }
            if (Character.isUpperCase(ch)) {
                upperFlag = true;
            }
            if (specialFlag && digitFlag && lowerFlag && upperFlag) {
                break;
            }
        }

        if (!specialFlag) {
            throw new IllegalArgumentException("Password has no special characters");
        }
        if (!digitFlag) {
            throw new IllegalArgumentException("Password has no digit");
        }
        if (!lowerFlag) {
            throw new IllegalArgumentException("Password has no LowerCase symbol");
        }
        if (!upperFlag) {
            throw new IllegalArgumentException("Password has no UpperCase symbol");
        }

        return "Good password";
    }

}

