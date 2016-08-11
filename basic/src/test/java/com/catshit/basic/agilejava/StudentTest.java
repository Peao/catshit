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
}
