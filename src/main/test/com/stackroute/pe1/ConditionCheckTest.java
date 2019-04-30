package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionCheckTest
{
    //Arrange

    ConditionCheck p2;
    String strCheck;

    @Before
    public void setUp() throws Exception {
       p2  = new ConditionCheck();
    }

    @After
    public void tearDown() throws Exception {
        p2 = null;
    }

    @Test
        public void conditionalChecker1() throws Exception
    {
        // Act
        strCheck = p2.conditionalChecker(23);
        // Assert
        assertEquals("Tom",strCheck);
    }
    @Test
    public void conditionalChecker2() throws Exception
    {
        // Act
        strCheck = p2.conditionalChecker(22);
        // Assert
        assertEquals("Jerry",strCheck);
    }
    @Test
    public void conditionalChecker3() throws Exception
    {
        // Act
        strCheck = p2.conditionalChecker(33);
        // Assert
        assertEquals("neither Tom nor Jerry",strCheck);
    }

    }
