package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PasswordValidatorTest {

    @Test
    public void whenCorrectPassword() {
        String result = PasswordValidator.validate("Ab4*5123");
        assertThat(result).isEqualTo("Good password");
    }

    @Test
    public void whenPassIsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate(null);
                });
        assertThat(exception.getMessage()).isEqualTo("The password is missing");
    }

    @Test
    public void whenInvalidLength() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("abcd4*");
                });
        assertThat(exception.getMessage()).isEqualTo("Password length does not meet requirements");
    }

    @Test
    public void whenNoLowerCase() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("ABDAWDCW4*");
                });
        assertThat(exception.getMessage()).isEqualTo("Password has no LowerCase symbol");
    }

    @Test
    public void whenNoUpperCase() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("abdwd123*");
                });
        assertThat(exception.getMessage()).isEqualTo("Password has no UpperCase symbol");
    }

    @Test
    public void whenNoDigits() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("wAWDwadad//*");
                });
        assertThat(exception.getMessage()).isEqualTo("Password has no digit");
    }

    @Test
    public void whenNoSpecialSymbols() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("ACDWDAWd123");
                });
        assertThat(exception.getMessage()).isEqualTo("Password has no special characters");
    }

    @Test
    public void exceptionWordQwerty() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("QwErty");
                });
        assertThat(exception.getMessage()).isEqualTo("Use not an a default password");
    }

    @Test
    public void exceptionWordAdmin() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("AdMin");
                });
        assertThat(exception.getMessage()).isEqualTo("Use not an a default password");
    }

    @Test
    public void exceptionWordPassword() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("PassWord");
                });
        assertThat(exception.getMessage()).isEqualTo("Use not an a default password");
    }

    @Test
    public void exceptionDigits() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    PasswordValidator.validate("12345");
                });
        assertThat(exception.getMessage()).isEqualTo("Use not an a default password");
    }

}