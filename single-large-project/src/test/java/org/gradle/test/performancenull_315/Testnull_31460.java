package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31460 {
    private final Productionnull_31460 production = new Productionnull_31460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}