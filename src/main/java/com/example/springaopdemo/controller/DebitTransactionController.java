package com.example.springaopdemo.controller;

import com.example.springaopdemo.model.Transaction;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debit")
public class DebitTransactionController {
    @PostMapping("/")
    public ResponseEntity<Transaction> processDebitTransaction(@RequestBody Transaction debitTransaction,
                                                               HttpServletRequest request){


        return ResponseEntity.ok(debitTransaction);
    }

}
