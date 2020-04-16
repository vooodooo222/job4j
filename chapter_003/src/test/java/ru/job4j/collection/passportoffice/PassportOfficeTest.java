package ru.job4j.collection.passportoffice;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44b", "Vladimir Aleksandrov");
        Citizen citizen3 = new Citizen("2f44b", "Ivan Sidorov");
        PassportOffice office = new PassportOffice();
        office.add(citizen1);
        office.add(citizen2);
        boolean isCitizen3Add = office.add(citizen3);
        assertThat(office.get(citizen1.getPassport()), is(citizen1));
        assertThat(office.get(citizen2.getPassport()), is(citizen2));
        assertThat(isCitizen3Add, is(false));
    }
}