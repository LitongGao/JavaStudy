package com.Study.ClassAndObject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG2 {
    @BeforeSuite
    public void beforesuite() {
        System.out.println("beforesuite");
    }
    @AfterSuite
    public void aftersuite() {
        System.out.println("aftersuite");
    }
    
    @BeforeTest
    public void beforetest() {
        System.out.println("beforeTest");
    }
    @AfterTest
    public void AfterTest() {
        System.out.println("aftertest");
    }
    

    @BeforeClass
    public void beforeclass() {
        System.out.println("beforeclass's TestNG2");
    }
    
    @AfterClass
    public void aftertclass() {
        System.out.println("afterclass's TestNG2");
    }
    
    @BeforeMethod
    public void beforemethod() {
        System.out.println("TestNG2's beforemethod");
    }
    
    @AfterMethod
    public void aftertmethod() {
        System.out.println("TestNG2's aftermethod");
    }
    
    @BeforeGroups
    public void beforegroups() {
        System.out.println("TestNG2's beforegroups");
    }
    
    @AfterGroups
    public void aftergroups() {
        System.out.println("TestNG2's aftergroups");
    }
    
    @Test
    public void test1() {
        System.out.println("TestNG2's testt1");
    }
    
    @Test(groups="gr")
    public void test2() {
        System.out.println("TestNG2's testt2");
    }
    
    public void ff() {
        System.out.println("nothing");
    }
}
