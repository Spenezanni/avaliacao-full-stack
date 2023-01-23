package com.br.banktransaction.util.tranferByDays;


import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferByDaysService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class TransferOverTenDays extends TransferByDaysService {

    public TransferOverTenDays(TransferByDaysService nextTransferDays) {
        super(nextTransferDays);
    }

    @Override
    public BigDecimal calculateDaysAndRate(DataDto dataDto) {
        Period perid = Period.between(LocalDate.now(), dataDto.getSchedulingDay());
        int days = perid.getDays();
        if (days > 10 && days <= 20 || dataDto.getValue().intValue() <= 1000){
            return dataDto.getValue().multiply(new BigDecimal("0.082"));
        }
        return nextTransferDays.calculateDaysAndRate(dataDto);
    }

}
