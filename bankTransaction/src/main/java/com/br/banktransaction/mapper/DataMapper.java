package com.br.banktransaction.mapper;

import com.br.banktransaction.domain.dto.DataDto;
import com.br.banktransaction.domain.model.TransferScheduling;
import com.br.banktransaction.domain.request.DataRequest;
import com.br.banktransaction.domain.response.DataResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class DataMapper {

    public DataDto requestToDataDto(DataRequest dataRequest) {
            DataDto dataDto = new DataDto();
            dataDto.setAccountOrigin(dataRequest.getAccountOrigin());
            dataDto.setAccountDestiny(dataRequest.getAccountDestiny());
            dataDto.setValue(dataRequest.getValue());
            dataDto.setSchedulingDay(converterLocaldate(dataRequest));

            return dataDto;
    }

    private static LocalDate converterLocaldate(DataRequest dataRequest) {
        String data = dataRequest.getSchedulingDay();
        return LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }


    public DataResponse dtoToDataResponse(DataDto dataDto, BigDecimal result) {
        DataResponse dataResponse = new DataResponse();
        dataResponse.setDateScheduling(dataDto.getSchedulingDay());
        dataResponse.setDateTransferScheduling(dataDto.getDateTransferScheduling());
        dataResponse.setRateAmount(result);
        return dataResponse;
    }

    public TransferScheduling DtoToTransferScheduling(DataDto dataDto, BigDecimal result) {
        TransferScheduling transferScheduling = new TransferScheduling();
        transferScheduling.setDateScheduling(dataDto.getSchedulingDay());
        transferScheduling.setDateTransferScheduling(dataDto.getDateTransferScheduling());
        transferScheduling.setRateAmount(result);
        return transferScheduling;
    }
}
