package ru.job4j.streamapi.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.streamapi.map.Profile.collect;

public class ProfileTest {

    @Test
    public void getClassAList() {
        final List<Profile> profilesList = new ArrayList<>();
        profilesList.add(new Profile(new Address("City2", "StreetB", 2, 2)));
        profilesList.add(new Profile(new Address("City3", "StreetC", 3, 3)));
        profilesList.add(new Profile(new Address("City1", "StreetA", 1, 1)));
        profilesList.add(new Profile(new Address("City2", "StreetB", 2, 2)));
        List<Address> actualAddress = collect(profilesList);
        List<Address> expectedAddress = new ArrayList<>();
        expectedAddress.add(new Address("City1", "StreetA", 1, 1));
        expectedAddress.add(new Address("City2", "StreetB", 2, 2));
        expectedAddress.add(new Address("City3", "StreetC", 3, 3));
        assertThat(actualAddress, is(expectedAddress));
    }

}