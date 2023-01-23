package com.br.banktransaction.service.impl;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.domain.model.TransferScheduling;
import com.br.banktransaction.domain.response.DataResponse;
import com.br.banktransaction.mapper.DataMapper;
import com.br.banktransaction.repository.TransactionRepository;
import com.br.banktransaction.service.TransactionService;
import com.br.banktransaction.service.TransferTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired(required=true)
    private TransferTypeService transferTypeService;

    @Autowired(required=true)
    private DataMapper dataMapper;

    @Override
    public DataResponse calculateTransfer(DataDto dataDto) {
        BigDecimal result = transferTypeService.calculateTransferByType(dataDto);
        TransferScheduling transferScheduling = dataMapper.DtoToTransferScheduling(dataDto, result);
        transactionRepository.save(transferScheduling);
        return dataMapper.dtoToDataResponse(dataDto, result);
    }
}
