package com.zhao.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteConfig {
    @BeforeSuite
    public  void  config(){
        System.out.println("/n");
        System.out.println("suite Config");
    }
    @AfterSuite
    public void after(){
        System.out.println("after suite ");
    }
}
