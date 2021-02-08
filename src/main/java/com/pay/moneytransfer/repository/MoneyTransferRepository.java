package com.pay.moneytransfer.repository;

import com.pay.moneytransfer.model.MoneyTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MoneyTransferRepository extends JpaRepository<MoneyTransfer, UUID> {

    List<MoneyTransfer> findByFromAccountNumberIs(String fromAccountNumber);
}
