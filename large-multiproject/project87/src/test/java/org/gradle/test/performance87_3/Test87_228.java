package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_228 {
    private final Production87_228 production = new Production87_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}