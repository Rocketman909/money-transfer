package com.pay.moneytransfer.service;

import com.pay.moneytransfer.dto.StatementDto;
import com.pay.moneytransfer.model.MoneyTransfer;
import com.pay.moneytransfer.repository.MoneyTransferRepository;
import org.springframework.stereotype.Service;

@Service
public class StatementService {

    private final MoneyTransferRepository moneyTransferRepository;

    public StatementService(MoneyTransferRepository moneyTransferRepository) {
        this.moneyTransferRepository = moneyTransferRepository;
    }

    /**
     * Генерирует выписку по счёту
     * Находит все переводы с переданного аккаунта и считает их сумму
     */
    public StatementDto generate(String accountNumber) {
        Double totalAmount = moneyTransferRepository.findByFromAccountNumberIs(accountNumber)
                .stream()
                .map(MoneyTransfer::getAmount)
                .reduce(0.0, Double::sum);

        return new StatementDto(accountNumber, totalAmount);
    }
}
