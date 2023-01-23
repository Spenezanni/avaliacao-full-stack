package com.br.banktransaction.util.tranferByDays;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferByDaysService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class TransferOverThirtyDays extends TransferByDaysService {

    public TransferOverThirtyDays(TransferByDaysService transferDaysService) {
        super(transferDaysService);
    }

    @Override
    public BigDecimal calculateDaysAndRate(DataDto dataDto) {
        Period perid = Period.between(LocalDate.now(), dataDto.getSchedulingDay());
        int days = perid.getDays();
        if (days > 20 && days < 40 || dataDto.getValue().intValue() >= 2001) {
            return dataDto.getValue().multiply(new BigDecimal("0.047"));
        }
        return nextTransferDays.calculateDaysAndRate(dataDto);
    }
}
