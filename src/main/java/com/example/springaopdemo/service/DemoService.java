package com.example.springaopdemo.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Scheduled(fixedDelay = 1000)
    public void demo(){
        System.out.println("scheduler started at: "+System.currentTimeMillis());
    }

}
