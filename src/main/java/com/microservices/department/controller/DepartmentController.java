package com.microservices.department.controller;


import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import com.microservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments/")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId (
           @PathVariable("id") Long department){
        log.info("Inside findDepartmentById method of DepartmentController");
        return departmentService.findByDepartmentId(department);
    }



}
