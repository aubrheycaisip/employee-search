package org.employee.search.service.impl;

import org.employee.search.service.TestingService;
import org.springframework.stereotype.Service;

@Service
public class TestingServiceImpl implements TestingService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}
