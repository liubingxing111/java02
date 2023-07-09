package com;
import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void testSay() {
        Demo d = new Demo();
        String ret = d.say("heima");
        Assert.assertEquals("helloheima", ret);
    }
}
