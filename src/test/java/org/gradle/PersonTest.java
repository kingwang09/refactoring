package org.gradle;

import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

import org.junit.Test;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
    
    @Test
    public void decimalFormatTest() {
    	Double value = -1232132.45678;
    	System.out.println(value);
    	System.out.println(Math.round(value * 100D)/100D);
    }
}
