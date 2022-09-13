package com.sametcanal;

import com.sametcanal.data.entity.EmployeeEntity;
import com.sametcanal.data.repository.EmployeeRepository;
import com.sametcanal.test.TestCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodluyoruzApplicationTests implements TestCrud {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    // Create
    @Test
    @Override
    public void testCreate() {
        EmployeeEntity employeeEntity = EmployeeEntity
                .builder()
                .firstName("Sametcan Test")
                .lastName("Al Test")
                .email("sametcanal53@gmail.com Test")
                .build();
        employeeRepository.save(employeeEntity);
        assertNotNull(employeeRepository.findById(1L).get());
    }

    // List
    @Test
    @Override
    public void testList() {
        List<EmployeeEntity> list = employeeRepository.findAll();
        assertThat(list).size().isGreaterThan(0);
    }

    // Find
    @Test
    @Override
    public void testFindById() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        assertEquals("Sametcan Test", employeeEntity.getFirstName());
    }

    //Update
    @Test
    @Override
    public void testUpdate() {
        EmployeeEntity employeeEntity = employeeRepository.findById(1L).get();
        employeeEntity.setFirstName("Sametcan 53 Test");
        employeeRepository.save(employeeEntity);

        assertNotEquals("Sametcan Test", employeeRepository.findById(1L).get().getFirstName());
    }
    // Delete
    @Test
    @Override
    public void testDelete() {
        employeeRepository.deleteById(1L);
        assertThat(employeeRepository.existsById(1L)).isFalse();
    }
}
