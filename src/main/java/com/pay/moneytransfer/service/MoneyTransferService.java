package com.pay.moneytransfer.service;

import com.pay.moneytransfer.dto.MoneyTransferDto;
import com.pay.moneytransfer.model.MoneyTransfer;
import com.pay.moneytransfer.repository.MoneyTransferRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MoneyTransferService {

    private final MoneyTransferRepository moneyTransferRepository;

    public MoneyTransferService(MoneyTransferRepository moneyTransferRepository) {
        this.moneyTransferRepository = moneyTransferRepository;
    }

    /**
     * Метод для осуществления операции перевода
     */
    public void transfer(MoneyTransferDto moneyTransferDto) {
        moneyTransferRepository.save(new MoneyTransfer(
                moneyTransferDto.getFromAccountNumber(),
                moneyTransferDto.getToAccountNumber(),
                moneyTransferDto.getAmount(),
                moneyTransferDto.getComment()
        ));
    }

    /**
     *
     */
    public List<MoneyTransferDto> getAllMoneyTransfersFrom(String fromAccountNumber) {
        return moneyTransferRepository.findByFromAccountNumberIs(fromAccountNumber)
                .stream()
                .map(moneyTransfer -> new MoneyTransferDto(
                        moneyTransfer.getFromAccountNumber(),
                        moneyTransfer.getToAccountNumber(),
                        moneyTransfer.getAmount(),
                        moneyTransfer.getComment()
                ))
                .collect(Collectors.toList());
    }
}
