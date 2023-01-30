package com.Aston.controller;

import com.Aston.entity.Employee;
import com.Aston.service.EmployeeService;
import org.junit.Test;
import org.springframework.web.bind.annotation.ModelAttribute;

import static org.junit.Assert.*;

public class MyControllerTest {

    private EmployeeService employeeService;

    @Test
    public void showAllEmployees() {
    }

    // Что ты черт возьми такое несешь? 0_о
    @Test
    public void addNewEmployee() {
        Employee actual = new Employee();
        Employee expected = actual;
        assertEquals(expected, actual);
    }

    @Test
    public void saveEmployee(@ModelAttribute("employee") Employee employee) {

    }


    @Test
    public void updateEmployee() {
    }

    @Test
    public void deleteEmployee() {
    }
}