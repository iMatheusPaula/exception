package com.example.demo.model;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties;

public class Sum {
    private String result;

    public Sum(Integer num1, Integer num2){
        this.result = "O resultado da soma e: " + (num1+num2) + "!";
    }

    public String getResult(){
        return result;
    }
}