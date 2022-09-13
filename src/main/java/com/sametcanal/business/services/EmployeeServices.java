package com.sametcanal.business.services;

import com.sametcanal.business.dto.EmployeeDto;
import com.sametcanal.data.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface EmployeeServices {

    //crud
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity createEmployee(EmployeeDto employeeDto);
    ResponseEntity<EmployeeEntity> getEmployeeById(Long id);
    ResponseEntity<EmployeeEntity> updateEmployee(Long id,EmployeeDto employeeDto);
    ResponseEntity<Map<String,Boolean>> deleteEmployee(Long id);

}
