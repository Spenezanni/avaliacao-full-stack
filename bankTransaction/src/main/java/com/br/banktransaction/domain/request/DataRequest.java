package com.br.banktransaction.domain.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DataRequest {

    private String accountOrigin;
    private String accountDestiny;
    private BigDecimal value;
    private String schedulingDay;
}
