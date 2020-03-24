package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import java.util.Date;

public class LicenseTest {
    @Test
    public void eqName() {
        License first = new License();
        first.setOwner("Aleksandrov Vladimir");
        first.setModel("Kia");
        first.setCode("xx222x");
        first.setCreated(new Date());
        License second = new License();
        second.setOwner("Aleksandrov Vladimir");
        second.setModel("Kia");
        second.setCode("xx222x");
        second.setCreated(new Date());
        assertThat(first, is(second));
    }
}