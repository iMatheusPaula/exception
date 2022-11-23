package com.example.demo.controller;

import com.example.demo.exception.InvalidCharacterException;
import com.example.demo.model.Sum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/somapranois")
public class SumController {
    @GetMapping(value = "/{num1}/{num2}")
    public Integer getNumbers(@PathVariable String num1, @PathVariable String num2){
        try {
            int num3 = Integer.parseInt(num1);
            int num4 = Integer.parseInt(num2);
            return num3+num4;
        } catch (Exception e) {
            throw new InvalidCharacterException("Não é permitido letras nos números");
        }
    }
}