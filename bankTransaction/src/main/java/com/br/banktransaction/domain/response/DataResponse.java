package com.br.banktransaction.domain.response;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class DataResponse {

    private LocalDate dateScheduling;
    private LocalDate dateTransferScheduling;
    private BigDecimal rateAmount;
}
