package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25493 {
    private final Productionnull_25493 production = new Productionnull_25493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}