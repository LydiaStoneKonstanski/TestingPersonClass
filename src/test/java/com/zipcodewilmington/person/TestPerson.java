package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testAllFieldsConstructor() {
        // Given
        String expectedName = "June Smith";
        Integer expectedAge = 32;
        boolean expectedDancer = true;
        String expectedDanceStyle = "Ballroom";
        boolean expectedInstructor = false;

        // When
        Person person = new Person(expectedName, expectedAge, expectedDancer, expectedDanceStyle, expectedInstructor);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        boolean actualDancer = person.getDancer();
        String actualDanceStyle = person.getDanceStyle();
        boolean actualInstructor = person.getInstructor();


        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedDancer, actualDancer);
        Assert.assertEquals(expectedDanceStyle, actualDanceStyle);
        Assert.assertEquals(expectedInstructor, actualInstructor);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetDancer() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setDancer(true);

        // Then
        boolean actual = person.getDancer();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetDanceStyle() {
        // Given
        Person person = new Person();
        String expected = "Blues";

        // When
        person.setDanceStyle(expected);

        // Then
        String actual = person.getDanceStyle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetInstructor() {
        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setInstructor(expected);

        // Then
        boolean actual = person.getInstructor();
        Assert.assertEquals(expected, actual);
    }
}
