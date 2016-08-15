package com.catshit.basic.agilejava;

import junit.framework.TestCase;

/**
 * @author Leon
 */
public class RosterReportTest extends TestCase {

    public void testGetRosterReport() {
        CourseSession session = new CourseSession("LB", "001");
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        RosterReport rosterReport = new RosterReport(session);

        assertEquals(RosterReport.ROSTER_REPORT_HEADER + "A" + RosterReport.NEWLINE + "B" + RosterReport.NEWLINE +
                RosterReport.ROSTER_REPORT_FOOTER + "2" + RosterReport.NEWLINE, rosterReport.getRosterReport());
    }

}
