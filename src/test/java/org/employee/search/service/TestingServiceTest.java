package org.employee.search.service;

import static org.junit.jupiter.api.Assertions.*;

import org.employee.search.service.impl.TestingServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class TestingServiceTest {

    @Autowired
    private TestingServiceImpl testingService;

    @Test
    @DisplayName("Add two numbers")
    void test(){
        int expected = 3;
        int actual = testingService.add(2,1);
//        int actual = 2 + 1;
        System.out.println("expected: " + expected + " actual: " + actual);
        assertEquals(expected, actual);
    }

}