package com.pay.moneytransfer.dto;

/**
 * Общая выписка об операция на счёте
 */
public class StatementDto {

    /**
     * Номер счёта
     */
    private String accountNumber;

    /**
     * Общая сумма списанная со счёта
     */
    private Double withdrawAmount;

    public StatementDto(String accountNumber, Double withdrawAmount) {
        this.accountNumber = accountNumber;
        this.withdrawAmount = withdrawAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
