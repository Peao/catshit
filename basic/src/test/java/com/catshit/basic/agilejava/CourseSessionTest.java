package com.catshit.basic.agilejava;

import junit.framework.TestCase;

import java.util.Date;

/**
 * 存储课程信息
 *
 * @author Leon
 */
public class CourseSessionTest extends TestCase {
    private static final int CREDITS = 3;
    private CourseSession session;
    private Date startDate;


    @Override
    protected void setUp() throws Exception {
        startDate = DateUtil.createDate(2003, 1, 6);
        session = createCourseSession();
    }

    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
    }

    public void testEnrollStudents() {
        Student student1 = new Student("LiMing");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(CourseSessionTest.CREDITS, student1.getCredits());

        Student student2 = new Student("XiaoHong");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student2, session.get(1));
        assertEquals(CourseSessionTest.CREDITS, student2.getCredits());

    }

    public void testCourseDates() {
        Date endDate = DateUtil.createDate(2003, 4, 25);

        assertEquals(endDate, session.getEndDate());
        assertEquals(startDate, session.getStartDate());
    }

    private CourseSession createCourseSession() {
        CourseSession session = CourseSession.create("ENGL", "101", startDate);
        session.setNumberOfCredits(CourseSessionTest.CREDITS);
        return session;
    }


}
