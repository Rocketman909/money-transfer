package com.pay.moneytransfer.controller;

import com.pay.moneytransfer.dto.MoneyTransferDto;
import com.pay.moneytransfer.model.MoneyTransfer;
import com.pay.moneytransfer.service.MoneyTransferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/money")
@RestController
public class MoneyTransferController {

    private final MoneyTransferService moneyTransferService;

    public MoneyTransferController(MoneyTransferService moneyTransferService) {
        this.moneyTransferService = moneyTransferService;
    }

    /**
     * Добавляет информацию о новом переводе в систему
     *
     * @param moneyTransferDto - вся информация о переводе
     */
    @PostMapping("transfer")
    public void transferMoney(@RequestBody MoneyTransferDto moneyTransferDto) {
        moneyTransferService.transfer(moneyTransferDto);
    }

    @GetMapping("transfer")
    public List<MoneyTransferDto> getAllMoneyTransfersFrom(@RequestParam String fromAccountNumber) {
        return moneyTransferService.getAllMoneyTransfersFrom(fromAccountNumber);
    }
}
