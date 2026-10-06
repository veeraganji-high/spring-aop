package com.example.springaopdemo.model;

import lombok.Data;

import java.util.Date;
@Data
public class DebitTransaction {
    private Double amount;
    private Integer customerId;
    private String customerName;
}
