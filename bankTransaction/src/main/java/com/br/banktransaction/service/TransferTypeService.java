package com.br.banktransaction.service;

import com.br.banktransaction.domain.dto.DataDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class TransferTypeService {

    protected TransferTypeService nextTransferByType;

    public abstract BigDecimal calculateTransferByType(DataDto dataDto);
}
