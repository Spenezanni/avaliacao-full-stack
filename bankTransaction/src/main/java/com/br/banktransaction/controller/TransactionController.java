package com.br.banktransaction.controller;

import com.br.banktransaction.domain.request.DataRequest;
import com.br.banktransaction.domain.response.DataResponse;
import com.br.banktransaction.mapper.DataMapper;
import com.br.banktransaction.service.impl.TransactionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
public class TransactionController {

    @Autowired
    private DataMapper dataMapper;
    @Autowired
    private TransactionServiceImpl transactionServiceImpl;

    @PostMapping("/scheduling")
    public ResponseEntity<DataResponse> createSchedulingTransaction(@RequestBody DataRequest dataRequest) {
        return ResponseEntity.ok(transactionServiceImpl.calculateTransfer(dataMapper.requestToDataDto(dataRequest)));
    }
}
