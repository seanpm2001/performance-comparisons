package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22904 {
    private final Productionnull_22904 production = new Productionnull_22904("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}