package org.employee.search.service.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TestingServiceImplTest {

    TestingServiceImpl service = new TestingServiceImpl();

    @Test
    @DisplayName("add function")
    void add() {
        assertEquals(2, service.add(1,1));
    }

    @Test
    @DisplayName("subtract function")
    void subtract() {
        assertEquals(0, service.subtract(1,1));
    }

    @Test
    @DisplayName("multiply function")
    void multiply() {
        assertEquals(2, service.multiply(2,1));
    }

    @Test
    @DisplayName("divide function")
    void divide() {
        assertEquals(1, service.divide(1,1));
    }
}