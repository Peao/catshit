package com.catshit.basic.agilejava;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 存储课程信息
 *
 * @author Leon
 */
public class CourseSessionTest extends TestCase {

    private CourseSession session;
    private Date startDate;


    @Override
    protected void setUp() throws Exception {
        startDate = createDate(2003, 1, 6);
        session = new CourseSession("ENGL", "101", startDate);
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

        Student student2 = new Student("XiaoHong");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        Date endDate = createDate(2003, 4, 25);

        assertEquals(endDate, session.getEndDate());
        assertEquals(startDate, session.getStartDate());
    }

    private Date createDate(int year, int month, int date) {

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);

        return calendar.getTime();
    }
}
