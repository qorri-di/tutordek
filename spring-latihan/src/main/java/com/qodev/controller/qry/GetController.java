package com.qodev.controller.qry;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qodev.dto.GeneralResponse;
import com.qodev.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/latihan/transaksi/stock")
public class GetController {

    @Autowired
    TransaksiService trxService;

    @GetMapping("/{id}")
    public GeneralResponse getEmployee(@PathVariable Integer id) throws JsonProcessingException {
        System.out.println("idBrand = "+id);
        GeneralResponse response = trxService.detailById(id);

        return response;
    }
}
