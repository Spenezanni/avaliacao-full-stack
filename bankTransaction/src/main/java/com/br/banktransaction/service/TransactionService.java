package com.br.banktransaction.service;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.domain.response.DataResponse;


public interface TransactionService {

    public DataResponse calculateTransfer(DataDto dataDto);

}
