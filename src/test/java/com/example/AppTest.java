package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testOutput() {
        assertEquals("Hello from Maven GitHub Actions Lab!", getMessage());
    }

    private String getMessage() {
        return "Hello from Maven GitHub Actions Lab!";
    }
}
