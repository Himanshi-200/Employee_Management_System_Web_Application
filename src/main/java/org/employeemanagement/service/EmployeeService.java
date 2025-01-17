package org.employeemanagement.service;

import java.util.List;

import org.employeemanagement.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page < Employee > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
