package com.qodev.controller.cmd;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qodev.dto.GeneralResponse;
import com.qodev.dto.transaction.TrxRequest;
import com.qodev.service.TransaksiService;
import io.vertx.core.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/latihan/transaksi/stock")
public class SaveController {
    @Autowired
    TransaksiService trxService;

    @PostMapping("save")
    public ResponseEntity helloPost(@RequestBody TrxRequest request) throws JsonProcessingException {
        GeneralResponse response= trxService.saveTransaksi(request);
        JsonObject jsonResponse= JsonObject.mapFrom(response);

        return new ResponseEntity(jsonResponse, HttpStatus.CREATED);
    }
}
