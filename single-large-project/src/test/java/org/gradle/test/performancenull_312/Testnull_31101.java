package org.gradle.test.performancenull_312;

import static org.junit.Assert.*;

public class Testnull_31101 {
    private final Productionnull_31101 production = new Productionnull_31101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}