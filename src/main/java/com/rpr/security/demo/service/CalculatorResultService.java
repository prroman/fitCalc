package com.rpr.security.demo.service;

import com.rpr.security.demo.model.CalculatorResult;
import org.springframework.stereotype.Service;

@Service
public class CalculatorResultService {

    public static CalculatorResult calculate(String name, int age, int height, int weight, char gender, float loadValue) {
        float DCNValue = CaloriesAlgorithms.getDCN(height, weight, age, gender);
        float DCNWithLoadsValue = CaloriesAlgorithms.getDCNWithLoads(DCNValue, loadValue);
        float DailyCaloriesNormToLoseWeightValue = CaloriesAlgorithms.getDCNLoseWeight(DCNWithLoadsValue);
        float DailyCaloriesNormToGainWeightValue = CaloriesAlgorithms.getDCNGainWeight(DCNWithLoadsValue);
        CalculatorResult result = new CalculatorResult();
        result.setName(name)
                .setAge(age)
                .setHeight(height)
                .setWeight(weight)
                .setGender(gender)
                .setLoadValue(loadValue)
                .setDailyCaloriesNormValue(DCNValue)
                .setDailyCaloriesNormWithLoadsValue(DCNWithLoadsValue)
                .setDailyCaloriesNormToLoseWeightValue(DailyCaloriesNormToLoseWeightValue)
                .setDailyCaloriesNormToGainWeightValue(DailyCaloriesNormToGainWeightValue)
                .setDailyProteinsToLoseWeightValue(CaloriesAlgorithms.getDailyProteins(DailyCaloriesNormToLoseWeightValue))
                .setDailyFatsToLoseWeightValue(CaloriesAlgorithms.getDailyFats(DailyCaloriesNormToLoseWeightValue))
                .setDailyСarbohydratesToLoseWeightValue(CaloriesAlgorithms.getDailyСarbohydrates(DailyCaloriesNormToLoseWeightValue))
                .setDailyProteinsOriginValue(CaloriesAlgorithms.getDailyProteins(DCNWithLoadsValue))
                .setDailyFatsOriginValue(CaloriesAlgorithms.getDailyFats(DCNWithLoadsValue))
                .setDailyСarbohydratesOriginValue(CaloriesAlgorithms.getDailyСarbohydrates(DCNWithLoadsValue))
                .setDailyProteinsToGainWeightValue(CaloriesAlgorithms.getDailyProteins(DailyCaloriesNormToGainWeightValue))
                .setDailyFatsToGainWeightValue(CaloriesAlgorithms.getDailyFats(DailyCaloriesNormToGainWeightValue))
                .setDailyСarbohydratesToGainWeightValue(CaloriesAlgorithms.getDailyСarbohydrates(DailyCaloriesNormToGainWeightValue));
        return result;
    }
}
