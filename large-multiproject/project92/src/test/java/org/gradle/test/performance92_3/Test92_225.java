package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_225 {
    private final Production92_225 production = new Production92_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}