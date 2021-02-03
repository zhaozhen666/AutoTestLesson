package com.zhao.testng;

import org.testng.annotations.*;

public class GroupTest {
    @Test(groups = "client")
    public  void testCase1(){
        System.out.println("testng basic");
    }

    @Test(groups = "server")
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
    @BeforeClass(groups = "client")
    public void beforeClass(){
        System.out.println("before client class");
    }

    @AfterClass(groups = "client")
    public void afterClass(){
        System.out.println("after  client class ");
    }

    @BeforeClass(groups = "server")
    public void beforeServerClass(){
        System.out.println("before server class");
    }

    @AfterClass(groups = "server")
    public void afterServerClass(){
        System.out.println("after server  class ");
    }

    @BeforeSuite
    public void  beforeSuite(){
        System.out.println("before suite ");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }
}
