package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_172 {
    private final Production64_172 production = new Production64_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}