package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;
    private boolean dancer;
    private String danceStyle;
    private boolean instructor;

    //Constructor
    public Person(String name, int age, boolean dancer, String danceStyle, boolean instructor) {
        this.name = name;
        this.age = age;
        this.dancer = dancer;
        this.danceStyle = danceStyle;
        this.instructor = instructor;

    }
    public Person() {

    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // End Constructors

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setDancer(boolean dancer) {
        this.dancer = dancer;
    }

    public void setDanceStyle(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    public void setInstructor(boolean instructor) {
        this.instructor = instructor;
    }

    public String getName() { return name;}
    public Integer getAge() { return age;}
    public boolean getDancer() { return dancer;}
    public String getDanceStyle() { return danceStyle;}
    public boolean getInstructor() { return instructor;}
}
