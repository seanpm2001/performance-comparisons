package org.gradle.test.performance9_3;

import static org.junit.Assert.*;

public class Test9_296 {
    private final Production9_296 production = new Production9_296("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}