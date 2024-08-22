package service;

import entity.Employee;

import java.util.List;

public interface EmployeeService {

    void update(int id, String name, String position);

    void update(int id, String password);

    List<Employee> getAllUserByDepartment(String department);

    List<Employee> getAllUserByAgeRetirement(int age);

    List<Employee> getAllUserByAgeRetirementDistance(int age);

    List<Employee> getAllUserByYearsOfExperience(int yearsOfExperience);
}
