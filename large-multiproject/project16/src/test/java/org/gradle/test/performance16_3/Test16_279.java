package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_279 {
    private final Production16_279 production = new Production16_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}