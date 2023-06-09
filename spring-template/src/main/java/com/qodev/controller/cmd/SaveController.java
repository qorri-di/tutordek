package com.qodev.controller.cmd;

import com.eksad.ddms.order.dto.GeneralResponse;
import com.eksad.ddms.order.dto.empSave.EmpSaveRequestDto;
import com.eksad.ddms.order.service.EmployeeService;
import io.vertx.core.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ddms/template/employee")
public class SaveController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("save")
    public ResponseEntity helloPost(@RequestBody EmpSaveRequestDto request) {
        GeneralResponse response=employeeService.employeeSaveService(request);
        JsonObject jsonResponse= JsonObject.mapFrom(response);

        return new ResponseEntity(jsonResponse, HttpStatus.CREATED);
    }
}
