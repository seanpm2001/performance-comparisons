package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25471 {
    private final Productionnull_25471 production = new Productionnull_25471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}