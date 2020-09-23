package org.citeck;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FirstTaskTest {

    @Test
    public void firstTaskFirstTest() {
        Integer[] arrayOfNumbers = new Integer[]{1, 2, 3, 3, 3, 3, 3, 3, 3, 10, 0, 1};

        List<String> result = FirstTask.execute(arrayOfNumbers);

        Assert.assertEquals(5, result.size());
        Assert.assertEquals("2=1", result.get(2));
        Assert.assertEquals("3=7", result.get(3));
        Assert.assertEquals("10=1", result.get(4));
    }

    @Test
    public void firstTaskSecondTest() {
        Integer[] arrayOfNumbers = new Integer[]{1, 2, 3, 3, -3, 3, -3, 3, 2, 3, 10, 2, -10, 0, 1};

        List<String> result = FirstTask.execute(arrayOfNumbers);
        Assert.assertEquals(7, result.size());
        Assert.assertEquals("-10=1", result.get(0));
        Assert.assertEquals("-3=2", result.get(1));
        Assert.assertEquals("0=1", result.get(2));
        Assert.assertEquals("1=2", result.get(3));
        Assert.assertEquals("2=3", result.get(4));
        Assert.assertEquals("3=5", result.get(5));
        Assert.assertEquals("10=1", result.get(6));

    }
}
