package com.catshit.basic.agilejava;

import java.util.*;

/**
 * 课程信息
 *
 * @author Leon
 */
public class CourseSession {
    private String department;
    private String number;
    private Date startDate;
    private int numberOfCredits;// 学分

    private ArrayList<Student> students = new ArrayList<>();


    public static CourseSession create(String department, String number, Date startDate) {
        return new CourseSession(department, number, startDate);
    }

    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.startDate = startDate;
    }

    private CourseSession(String department, String number) {
        this(department, number, null);
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    public Student get(int index) {
        return students.get(index);
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

}
