package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_36 {
    private final Production43_36 production = new Production43_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}