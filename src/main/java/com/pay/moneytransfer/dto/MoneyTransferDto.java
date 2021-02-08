package com.pay.moneytransfer.dto;

public class MoneyTransferDto {

    /**
     * Номер аккаунт с которого должны быть списаны деньги
     */
    private String fromAccountNumber;

    /**
     * Номер аккаунт на который должны быть зачислены деньги
     */
    private String toAccountNumber;

    /**
     * Сумма перевода
     */
    private Double amount;

    /**
     * Комментарий к переводу
     */
    private String comment;

    public MoneyTransferDto() {
    }

    public MoneyTransferDto(String fromAccountNumber, String toAccountNumber, Double amount, String comment) {
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.comment = comment;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public void setFromAccountNumber(String fromAccountNumber) {
        this.fromAccountNumber = fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public void setToAccountNumber(String toAccountNumber) {
        this.toAccountNumber = toAccountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
