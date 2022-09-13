package com.sametcanal.business.services.impl;

import com.sametcanal.business.dto.EmployeeDto;
import com.sametcanal.business.services.EmployeeServices;
import com.sametcanal.data.entity.EmployeeEntity;

import com.sametcanal.data.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeServices {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeDto employeeDto) {
        EmployeeEntity newEmployee = EmployeeEntity.builder()
                                                    .firstName(employeeDto.getFirstName())
                                                    .lastName(employeeDto.getLastName())
                                                    .email(employeeDto.getEmail())
                                                    .build();
        return this.employeeRepository.save(newEmployee);
    }

    @Override
    public ResponseEntity<EmployeeEntity> getEmployeeById(Long id){
        return ResponseEntity.ok(this.employeeRepository.findById(id).orElse(null));
    }

    @Override
    public ResponseEntity<EmployeeEntity> updateEmployee(Long id, EmployeeDto employeeDto){
        EmployeeEntity updateEmployee = employeeRepository.findById(employeeDto.getId()).orElse(null);
        updateEmployee.setEmail(employeeDto.getEmail());
        updateEmployee.setFirstName(employeeDto.getFirstName());
        updateEmployee.setLastName(employeeDto.getLastName());

        return ResponseEntity.ok(this.employeeRepository.save(updateEmployee));
    }

    @Override
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(Long id){
        this.employeeRepository.deleteById(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}