package com.catshit.basic.agilejava;

import junit.framework.TestSuite;

/**
 * 测试套件
 *
 * @author Leon
 */
public class AllTests {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        return suite;
    }
}
