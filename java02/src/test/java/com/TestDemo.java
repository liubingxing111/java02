package com;
import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void testSay() {
        Demo d = new Demo();
        String ret = d.say("heima");
        System.out.println("hello");
        System.out.println("hello2");

        Assert.assertEquals("helloheima", ret);
    }
}
