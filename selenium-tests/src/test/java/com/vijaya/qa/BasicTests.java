package com.vijaya.qa;

import java.beans.Transient;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTests{
    @BeforeMethod
    public void setUp(){
        System.out.println("Before Test");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After Test");
    }
    @Test
    public void additionWorks() {
        int result = 2 + 3;
        Assert.assertEquals(result, 5);
    }
    @Test
    public void testNameContainsLogin(){
        String testName = "LoginTest";
        Assert.assertTrue(testName.contains("Login"));
    }
    @Test
    public void listIsNotEmpty(){
        List<String> items = Arrays.asList("a","b");
        Assert.assertFalse(items.isEmpty());
    }
}