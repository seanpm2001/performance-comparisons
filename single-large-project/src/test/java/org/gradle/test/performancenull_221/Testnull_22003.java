package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22003 {
    private final Productionnull_22003 production = new Productionnull_22003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}