package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NotifyAccountTest {
    @Test
    public void whenTwoAccountsAddSent() {
        NotifyAccount notifyAccount = new NotifyAccount();
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(notifyAccount.sent(accounts)).containsAll(expect);
    }

    @Test
    public void whenRemoveDuplicates() {
        NotifyAccount notifyAccount = new NotifyAccount();
        List<Account> accounts = Arrays.asList(
                new Account("077", "Bruno Bucciarati", "eDer3432f"),
                new Account("077", "Mark Bucciarati", "012345"),
                new Account("0912", "Unknow Unknow", "0exd1245")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("077", "Bruno Bucciarati", "eDer3432f"),
                        new Account("0912", "Unknown Unknown", "0exd1245")
                )
        );
        assertThat(notifyAccount.sent(accounts)).containsAll(expect);

    }
}