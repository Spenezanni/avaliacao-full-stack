package com.br.banktransaction.service;

import com.br.banktransaction.domain.dto.DataDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TransferByDaysService {

    protected TransferByDaysService nextTransferDays;

    public abstract BigDecimal calculateDaysAndRate(DataDto dataDto);
}
