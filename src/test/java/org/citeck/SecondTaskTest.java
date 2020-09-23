package org.citeck;

import org.junit.Assert;
import org.junit.Test;

public class SecondTaskTest {

    @Test
    public void firstTestSecondTask() {
        String input = "[]";
        Assert.assertTrue(SecondTask.execute(input));
    }

    @Test
    public void secondTestSecondTask() {
        String input = "()";
        Assert.assertTrue(SecondTask.execute(input));
    }

    @Test
    public void thirdTestSecondTask() {
        String input = ")";
        Assert.assertFalse(SecondTask.execute(input));
    }

    @Test
    public void fourthTestSecondTask() {
        String input = "]";
        Assert.assertFalse(SecondTask.execute(input));
    }

    @Test
    public void fifthTestSecondTask() {
        String input = "([][]()])([][]()])";
        Assert.assertFalse(SecondTask.execute(input));
    }

    @Test
    public void sixthTestSecondTask() {
        String input = "([][[]()])";
        Assert.assertTrue(SecondTask.execute(input));
    }
}
