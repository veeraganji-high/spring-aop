package com.example.springaopdemo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction extends DebitTransaction {
    private String transactionType;
    private Date created_at;
    private Date updated_at;
    private Double balance;
    private String transaction_id;
}
