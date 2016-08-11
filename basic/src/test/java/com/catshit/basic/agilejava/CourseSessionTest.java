package com.catshit.basic.agilejava;

import junit.framework.TestCase;

/**
 * 存储课程信息
 *
 * @author Leon
 */
public class CourseSessionTest extends TestCase {

    public void testCreate() {
        CourseSession courseSession = new CourseSession("ENGL", "101");

        assertEquals("ENGL", courseSession.getDepartment());
        assertEquals("101", courseSession.getNumber());
        assertEquals(0, courseSession.getNumberOfStudents());
    }

    /**
     * 招收学生
     */
    public void testEnrollStudents() {
        CourseSession courseSession = new CourseSession("ENGL", "101");
        Student student1 = new Student("LiMing");
        courseSession.enroll(student1);
        assertEquals(1, courseSession.getNumberOfStudents());
        assertEquals(student1, courseSession.get(0));

        Student student2 = new Student("XiaoHong");
        courseSession.enroll(student2);
        assertEquals(2, courseSession.getNumberOfStudents());
        assertEquals(student2, courseSession.get(1));

    }
}
