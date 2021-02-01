package com.zhao.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {
    @Test
    public  void testCase1(){
        System.out.println("testng basic");
    }

    @Test
    public void testCase2(){
        System.out.println("testng basic 2 ");
    }

    @BeforeMethod(firstTimeOnly = true)
    public void  before(){
        System.out.println(" before test");
    }
    @AfterMethod
    public  void after(){
        System.out.println("after test");
    }

}
