package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_196 {
    private final Production54_196 production = new Production54_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}