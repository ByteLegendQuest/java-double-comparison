package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void doubleEqualsTest() {
        Assertions.assertTrue(Main.doubleEquals(0.1 + 0.2, 0.3));
        Assertions.assertTrue(Main.doubleEquals(0.7 + 0.2, 0.9));
        Assertions.assertFalse(Main.doubleEquals(0.1, 0.2));
        Assertions.assertFalse(Main.doubleEquals(0.1, 0.11));
        Assertions.assertFalse(Main.doubleEquals(0.1, 0.1001));
        Assertions.assertFalse(Main.doubleEquals(0.1, 0.10000001));
        Assertions.assertFalse(Main.doubleEquals(0.2, 0.1));
    }
}
