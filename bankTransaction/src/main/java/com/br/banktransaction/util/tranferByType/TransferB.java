package com.br.banktransaction.util.tranferByType;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferTypeService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class TransferB extends TransferTypeService {

    private static final BigDecimal RATE_DAY = new BigDecimal("12.00");

    public TransferB(TransferTypeService nextTransferByType) {
        super(nextTransferByType);
    }

    @Override
    public BigDecimal calculateTransferByType(DataDto dataDto) {
        Period perid = Period.between(LocalDate.now(), dataDto.getSchedulingDay());
        int days = perid.getDays();

        if(days <= 10 || dataDto.getValue().intValue() <= 1000 && dataDto.getValue().intValue() <= 2000) {
            return RATE_DAY;
        }
        return nextTransferByType.calculateTransferByType(dataDto);
    }
}
