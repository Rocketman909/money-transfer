package com.pay.moneytransfer.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

@Entity
public class MoneyTransfer {

    /**
     * Уникальный идентификатор сущности
     */
    @Id
    private UUID uuid = UUID.randomUUID();

    /**
     * Номер аккаунт с которого должны списаны деньги
     */
    private String fromAccountNumber;

    /**
     * Номер аккаунт на который должны были зачислены деньги
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

    /**
     * Дата и время перевода
     */
    @CreatedDate
    private Instant createDateTime;

    public MoneyTransfer() {
    }

    public MoneyTransfer(String fromAccountNumber, String toAccountNumber, Double amount, String comment) {
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.comment = comment;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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

    public Instant getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Instant createDateTime) {
        this.createDateTime = createDateTime;
    }
}
