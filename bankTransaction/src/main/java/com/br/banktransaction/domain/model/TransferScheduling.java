package com.br.banktransaction.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_transferScheduling")
public class TransferScheduling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateScheduling;
    private LocalDate dateTransferScheduling;
    private BigDecimal rateAmount;

    private Long accountOriginId;
    private Long accountDentinyId;

}
