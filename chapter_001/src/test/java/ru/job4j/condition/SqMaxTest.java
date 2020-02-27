package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void max1_1() {
        int result = SqMax.max(4,1,2,3);
        assertThat(result, is(4));
    }

    @Test
    public void max1_2() {
        int result = SqMax.max(4,1,3,2);
        assertThat(result, is(4));
    }

    @Test
    public void max1_3() {
        int result = SqMax.max(4,2,1,3);
        assertThat(result, is(4));
    }

    @Test
    public void max1_4() {
        int result = SqMax.max(4,3,1,2);
        assertThat(result, is(4));
    }

    @Test
    public void max1_5() {
        int result = SqMax.max(4,2,3,1);
        assertThat(result, is(4));
    }

    @Test
    public void max1_6() {
        int result = SqMax.max(4,3,2,1);
        assertThat(result, is(4));
    }


    @Test
    public void max2_1() {
        int result = SqMax.max(1,4,2,3);
        assertThat(result, is(4));
    }

    @Test
    public void max2_2() {
        int result = SqMax.max(1,4,3,2);
        assertThat(result, is(4));
    }

    @Test
    public void max2_3() {
        int result = SqMax.max(2,4,1,3);
        assertThat(result, is(4));
    }

    @Test
    public void max2_4() {
        int result = SqMax.max(2,4,3,1);
        assertThat(result, is(4));
    }

    @Test
    public void max2_5() {
        int result = SqMax.max(3,4,1,2);
        assertThat(result, is(4));
    }

    @Test
    public void max2_6() {
        int result = SqMax.max(3,4,2,1);
        assertThat(result, is(4));
    }

    @Test
    public void max3_1() {
        int result = SqMax.max(1,2,4,3);
        assertThat(result, is(4));
    }

    @Test
    public void max3_2() {
        int result = SqMax.max(2,1,4,3);
        assertThat(result, is(4));
    }

    @Test
    public void max3_3() {
        int result = SqMax.max(3,1,4,2);
        assertThat(result, is(4));
    }

    @Test
    public void max3_4() {
        int result = SqMax.max(3,2,4,1);
        assertThat(result, is(4));
    }

    @Test
    public void max3_5() {
        int result = SqMax.max(1,3,4,2);
        assertThat(result, is(4));
    }

    @Test
    public void max3_6() {
        int result = SqMax.max(2,3,4,1);
        assertThat(result, is(4));
    }

    @Test
    public void max4_1() {
        int result = SqMax.max(1,2,3,4);
        assertThat(result, is(4));
    }

    @Test
    public void max4_2() {
        int result = SqMax.max(1,3,2,4);
        assertThat(result, is(4));
    }

    @Test
    public void max4_3() {
        int result = SqMax.max(2,1,3,4);
        assertThat(result, is(4));
    }

    @Test
    public void max4_4() {
        int result = SqMax.max(2,3,1,4);
        assertThat(result, is(4));
    }

    @Test
    public void max4_5() {
        int result = SqMax.max(3,2,1,4);
        assertThat(result, is(4));
    }

    @Test
    public void max4_6() {
        int result = SqMax.max(3,1,2,4);
        assertThat(result, is(4));
    }

}
