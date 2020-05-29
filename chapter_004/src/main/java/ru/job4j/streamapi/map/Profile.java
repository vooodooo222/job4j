package ru.job4j.streamapi.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(p -> p.address).sorted().distinct().collect(Collectors.toList());
    }
}
