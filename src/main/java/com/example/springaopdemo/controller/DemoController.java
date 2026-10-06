package com.example.springaopdemo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/first")
    public ResponseEntity<String> firstAPI(HttpServletResponse response){

        ResponseEntity<String> responseEntity = new ResponseEntity<>("Success",HttpStatusCode.valueOf(200));
        return responseEntity;
    }
}
