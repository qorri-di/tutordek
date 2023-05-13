package com.qodev.service;

import com.qodev.domain.MasterEmployee;
import com.qodev.domain.VwListemployee;
import com.qodev.dto.GeneralResponse;
import com.qodev.dto.empSave.EmpSaveRequestDto;
import com.qodev.dto.empSave.EmpSaveResponseDto;
import com.qodev.repository.EmployeeRepository;
import com.qodev.repository.VwListEmployeeRepo;
import io.vertx.core.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    VwListEmployeeRepo vwListEmployeeRepo;
    public GeneralResponse employeeSaveService(EmpSaveRequestDto request) {
        //  log.debug(JsonObject.mapFrom(request).encodePrettily());
        GeneralResponse response = new GeneralResponse();
        EmpSaveResponseDto dataResult = new EmpSaveResponseDto();

        Long empId = request.getEmpId();

        if (empId == null) {
            //insert
            MasterEmployee masterEmployee = new MasterEmployee();
            masterEmployee.setFullname(request.getFullname());
            masterEmployee.setBirthdate(new Date());
            masterEmployee.setDivisionCode(request.getDivisionCode());
            masterEmployee.setGender(request.getGender());
            masterEmployee.setLevelCode(request.getLevelCode());
            masterEmployee.setPositionCode(request.getPositionCode());

            MasterEmployee save = employeeRepository.save(masterEmployee);
            empId = masterEmployee.getEmpId();
        } else {
            //update
            Optional<MasterEmployee> masterEmployeeOptional = employeeRepository.findById(empId);
            if (masterEmployeeOptional.isPresent()) {
                MasterEmployee masterEmployee = masterEmployeeOptional.get();
                masterEmployee.setFullname(request.getFullname());
                masterEmployee.setBirthdate(new Date());
                masterEmployee.setDivisionCode(request.getDivisionCode());
                masterEmployee.setGender(request.getGender());
                masterEmployee.setLevelCode(request.getLevelCode());
                masterEmployee.setPositionCode(request.getPositionCode());
                MasterEmployee save = employeeRepository.save(masterEmployee);
            } else {
                dataResult.setResult(false);
                dataResult.setEmpId(null);
                response.setData(dataResult);
                response.setStatus("failed data not found");
                return response;
            }
        }

        dataResult.setResult(true);
        dataResult.setEmpId(empId);
        response.setData(dataResult);
        response.setStatus("success");
        //    log.debug(JsonObject.mapFrom(response).encodePrettily());
        return response;

    }


    public List<VwListemployee> getEmployees(Integer offset,Integer limit){
        return vwListEmployeeRepo.getAllEmployee((Pageable)PageRequest.of(offset,limit));
    }

}
