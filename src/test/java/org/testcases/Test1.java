package org.testcases;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    @Test
    public void t1(){
        System.out.println("Running Test1..");
        Assert.assertTrue(true);
    }

    @Test
    public void t2(){
        System.out.println("Running Test2..");
        Assert.assertFalse(false);
    }
}