package com.br.banktransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.br.banktransaction.service.TransferTypeService")
@SpringBootApplication
public class BankTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankTransactionApplication.class, args);
    }

}
