package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_461 {
    private final Production14_461 production = new Production14_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}