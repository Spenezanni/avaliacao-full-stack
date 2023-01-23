package com.br.banktransaction.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class DataDto {

    private String accountOrigin;
    private String accountDestiny;
    private BigDecimal value;
    private LocalDate schedulingDay;
    private LocalDate dateTransferScheduling;

}
