package com.pay.moneytransfer.controller;

import com.pay.moneytransfer.dto.StatementDto;
import com.pay.moneytransfer.service.StatementService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatementController {

    private final StatementService statementService;

    public StatementController(StatementService statementService) {
        this.statementService = statementService;
    }

    /**
     * Создаёт выписку по указанному счёту, подсчитывает общую сумму количество списаний
     *
     * @return - выписка
     */
    @GetMapping("statement")
    public StatementDto generate(@RequestParam String accountNumber) {
        return statementService.generate(accountNumber);
    }
}
