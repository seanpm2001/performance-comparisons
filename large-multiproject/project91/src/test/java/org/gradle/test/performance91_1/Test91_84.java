package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_84 {
    private final Production91_84 production = new Production91_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}