package com.catshit.basic.agilejava;

import junit.framework.TestCase;

/**
 * @author Leon
 */
public class StudentTest extends TestCase {

    public void testCreate() {
        final String firstStudentName = "Leon";
        final String secondStudentName = "liuqq";

        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, student.getName());

    }

    public void testFullTime() {
        Student student = new Student("liuqq");
        assertFalse(student.isFullTime());
    }

    public void testCredits() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        student.addCredits(3);
        assertEquals(3, student.getCredits());
        student.addCredits(4);
        assertEquals(7, student.getCredits());
    }

    public void testStudentStatus() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        student.addCredits(3);
        assertEquals(3, student.getCredits());
        student.addCredits(4);
        assertEquals(7, student.getCredits());
        student.addCredits(5);
        assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());

        assertTrue(student.isFullTime());
    }

    public void testStudentState() {
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState("dsd");
        assertFalse(student.isInState());
        student.setState(Student.STATE);
        assertTrue(student.isInState());


    }
}
