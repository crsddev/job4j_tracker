package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenAlreadyExist() {
        Citizen citizen = new Citizen("4213Afa", "Example Expample");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        Citizen alreadyCitizen = new Citizen("4213Afa", "Example Expample");
        boolean rsl = office.add(alreadyCitizen);
        assertThat(rsl).isFalse();

    }
}