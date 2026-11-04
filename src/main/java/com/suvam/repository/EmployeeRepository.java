package com.suvam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.suvam.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    List<Employee> findAllByOrderByIdAsc();
}
