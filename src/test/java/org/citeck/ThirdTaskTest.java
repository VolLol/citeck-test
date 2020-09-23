package org.citeck;

import org.junit.Assert;
import org.junit.Test;

public class ThirdTaskTest {

    @Test
    public void firstTestThirdTask() {
        int inputValue = 11;
        String result = ThirdTask.execute(inputValue);
        Assert.assertEquals("11", result);
    }

    @Test
    public void secondTestThirdTask() {
        int inputValue = 10;
        String result = ThirdTask.execute(inputValue);
        Assert.assertEquals("11", result);
    }

    @Test
    public void thirdTestThirdTask() {
        int inputValue = 100;
        String result = ThirdTask.execute(inputValue);
        Assert.assertEquals("101", result);
    }


    @Test
    public void fourthTestThirdTask() {
        int inputValue = 109;
        String result = ThirdTask.execute(inputValue);
        Assert.assertEquals("119", result);
    }

    @Test
    public void fifthTestThirdTask() {
        int inputValue = 1009;
        String result = ThirdTask.execute(inputValue);
        Assert.assertEquals("1019", result);
    }

    @Test
    public void sixthTestThirdTask() {
        int inputValue = 189390123;
        String result = ThirdTask.execute(inputValue);
        Assert.assertEquals("189391123", result);
    }

}
