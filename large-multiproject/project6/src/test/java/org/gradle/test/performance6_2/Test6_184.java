package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_184 {
    private final Production6_184 production = new Production6_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}