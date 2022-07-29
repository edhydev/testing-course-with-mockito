package com.edhydev.repository;

import com.edhydev.domain.Employee;

import java.util.List;

public interface EmployeeRepository {

    Integer count();

    List<Employee> findAll();

    Employee findOne(Long id);
    
    Employee save(Employee smartphone);

    void saveAll(List<Employee> employees);

    boolean delete(Long id);

    void deleteAll();

}
