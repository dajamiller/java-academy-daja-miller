package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    public void testFirstName_lastName_Format() {
        // arrange

        String first = "First";
        String last = "Last";
        String expectedFullName= last + ", " +  first;

        // act
// call method to be testedString fullName = last + ", " + first;


        // assert

        assertEquals(expectedFullName, fullName);

        }

}