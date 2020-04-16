package ru.job4j.collection.converters;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfa", "Dress1"));
        orders.add(new Order("3sfb", "Dress2"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfb"), is(new Order("3sfb", "Dress2")));
    }
}