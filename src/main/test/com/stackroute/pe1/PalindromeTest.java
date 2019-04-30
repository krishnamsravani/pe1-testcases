package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    //Arrange

    Palindrome p1;
    int strCheck;

    @Before
    public void setUp() throws Exception {
        p1=new Palindrome();
    }


    @After
    public void tearDown() throws Exception {
        p1 = null;
    }

    @Test
        public void testfindPalindrome() throws Exception {
        // Act
        strCheck = p1.findPalindrome(8668);
        // Assert
        assertEquals(1,strCheck);
    }

        @Test
        public void testfindPalindromesuccess() throws Exception {
        // Act
        strCheck = p1.findPalindrome(2112);
        //Assert
        assertEquals(2,strCheck);
    }
        @Test
        public void testfindpalindromefailure() throws Exception {
        // Act
        strCheck = p1.findPalindrome(321);
        // Assert
        assertEquals(3,strCheck);
    }


    }
