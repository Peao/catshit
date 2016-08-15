package com.catshit.basic.agilejava;

import java.util.List;

/**
 * @author Leon
 */
public class RosterReport {
    public static final String NEWLINE = System.lineSeparator();
    public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "----" + NEWLINE;
    public static final String ROSTER_REPORT_FOOTER = NEWLINE + "# students = ";

    private CourseSession session;

    public RosterReport(CourseSession session) {
        this.session = session;
    }


    public String getRosterReport() {
        StringBuilder sb = new StringBuilder();
        sb.append(ROSTER_REPORT_HEADER);
        List<Student> students = session.getAllStudents();
        for (Student student : students) {
            sb.append(student.getName());
            sb.append(NEWLINE);
        }
        sb.append(ROSTER_REPORT_FOOTER);
        sb.append(students.size());
        sb.append(NEWLINE);
        return sb.toString();
    }
}
