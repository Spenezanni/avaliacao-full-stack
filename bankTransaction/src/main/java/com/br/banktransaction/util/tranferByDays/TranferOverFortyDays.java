package com.br.banktransaction.util.tranferByDays;


import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferByDaysService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class TranferOverFortyDays extends TransferByDaysService {

    public TranferOverFortyDays(TransferByDaysService transferDaysService) {
        super(transferDaysService);
    }

    @Override
    public BigDecimal calculateDaysAndRate(DataDto dataDto) {
        Period perid = Period.between(LocalDate.now(), dataDto.getSchedulingDay());
        int days = perid.getDays();
        if (days > 40) {
            return dataDto.getValue().multiply(new BigDecimal("0.017"));
        }
        return null;
    }
}
