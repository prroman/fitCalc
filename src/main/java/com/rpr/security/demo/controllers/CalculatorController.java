package com.rpr.security.demo.controllers;

import com.rpr.security.demo.model.CalculatorInput;
import com.rpr.security.demo.model.CalculatorResult;
import com.rpr.security.demo.service.CalculatorResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    private static CalculatorResultService calculatorResultService;

    @Autowired
    public CalculatorController(CalculatorResultService calculatorResultService) {
        this.calculatorResultService = calculatorResultService;
    }

    @PostMapping("/calculate")
    public CalculatorResult hello(@RequestBody CalculatorInput calculatorsInput) {
        return  calculatorResultService.calculate(calculatorsInput.getName(), calculatorsInput.getAge(), calculatorsInput.getHeight(),
                calculatorsInput.getWeight(), calculatorsInput.getGender(), calculatorsInput.getLoadValue());
    }
}
