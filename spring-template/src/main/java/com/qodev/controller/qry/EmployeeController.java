package com.qodev.controller.qry;

import com.qodev.domain.MasterEmployee;
import com.qodev.dto.GeneralResponse;
import com.qodev.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/ddms/template/employee")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("getEmployees")
    public GeneralResponse getEmployee(){
        GeneralResponse response = new GeneralResponse();
        response.setStatus("ok");
        //response.setData(service.getEmployees());

        return response;
    }
}
