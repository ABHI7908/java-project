package com.suvam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suvam.model.Employee;
import com.suvam.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/demo")
public class EmployeeController {
    @Autowired
    private EmployeeService empService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") @NonNull Long empId) throws Exception {
        return ResponseEntity.ok(empService.getEmployeeById(empId));
    }

    @PostMapping("/employee")
    public Employee createEmployee(@Valid @RequestBody @NonNull Employee emp) {
        return empService.createEmployee(emp);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(
            @PathVariable("id") @NonNull Long empId,
            @Valid @RequestBody @NonNull Employee empData) throws Exception {
        return ResponseEntity.ok(empService.updateEmployee(empId, empData));
    }

    @DeleteMapping("/employee/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable("id") @NonNull Long empId) throws Exception {
        empService.deleteEmployee(empId);
        Map<String, Boolean> result = new HashMap<>();
        result.put("deleted", true);
        return result;
    }
}
