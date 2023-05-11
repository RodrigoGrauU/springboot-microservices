package net.javaguides.employeeservice.service;

import net.javaguides.employeeservice.dto.ApiResponseDto;
import net.javaguides.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    ApiResponseDto getEmployeeById(Long employeeId);
}
