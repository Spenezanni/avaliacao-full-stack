package com.br.banktransaction.util.tranferByDays;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferByDaysService;

import java.math.BigDecimal;

public class NoRates extends TransferByDaysService {

    public NoRates() {
        super(null);
    }

    @Override
    public BigDecimal calculateDaysAndRate(DataDto dataDto) {
        return BigDecimal.ZERO;
    }
}
