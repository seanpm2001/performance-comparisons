package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_298 {
    private final Production6_298 production = new Production6_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}