package com.br.banktransaction.util.tranferByType;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferTypeService;

import java.math.BigDecimal;
import java.time.LocalDate;


public class TransferA extends TransferTypeService {

    public TransferA(TransferTypeService nextTransferByType) {
        super(nextTransferByType);
    }

    @Override
    public BigDecimal calculateTransferByType(DataDto dataDto) {

        if(LocalDate.now().equals(dataDto.getSchedulingDay()) || dataDto.getValue().intValue() <= 1000) {
           return dataDto.getValue().multiply(new BigDecimal("0.03"));
        }

        return nextTransferByType.calculateTransferByType(dataDto);
    }
}
