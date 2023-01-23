package com.br.banktransaction.repository;

import com.br.banktransaction.domain.model.TransferScheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransferScheduling, Long> {
}
