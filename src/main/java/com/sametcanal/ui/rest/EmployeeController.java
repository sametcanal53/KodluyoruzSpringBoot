package com.sametcanal.ui.rest;

import com.sametcanal.business.dto.EmployeeDto;
import com.sametcanal.business.services.EmployeeServices;
import com.sametcanal.data.entity.EmployeeEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeServices employeeService;

    //LIST
    // http://localhost:8080/api/v1/employees
    @GetMapping("/employees")
    public List<EmployeeEntity> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    //FIND
    // http://localhost:8080/api/v1/employees/1
    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable(name = "id") Long id) {
        return this.employeeService.getEmployeeById(id);
    }


    //SAVE
    // http://localhost:8080/api/v1/employees
    @PostMapping("/employees")
    public EmployeeEntity createEmployee(@RequestBody EmployeeDto employeeDto) { //@RequestBody
        return this.employeeService.createEmployee(employeeDto);
    }

    //UPDATE
    // http://localhost:8080/api/v1/employees/9
    @PutMapping("/employees/{id}")
    public ResponseEntity<EmployeeEntity> updateEmployee(@PathVariable(name = "id") Long id, @RequestBody EmployeeDto employeeDto) {
        return this.employeeService.updateEmployee(id, employeeDto);
    }

    //DELETE
    // http://localhost:8080/api/v1/employees/9
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable(name = "id") Long id) {
        return this.employeeService.deleteEmployee(id);
    }

}
