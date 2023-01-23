package com.br.banktransaction.util.tranferByType;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.service.TransferTypeService;
import com.br.banktransaction.service.TransferByDaysService;
import com.br.banktransaction.util.tranferByDays.*;

import java.math.BigDecimal;

public class TransferC extends TransferTypeService {

    @Override
    public BigDecimal calculateTransferByType(DataDto dataDto) {
            TransferByDaysService result = new TransferOverTenDays(
                    new TransferOverTwentyDays(new TransferOverThirtyDays(
                            new TranferOverFortyDays(new NoRates()))));
            return result.calculateDaysAndRate(dataDto);
    }
}

