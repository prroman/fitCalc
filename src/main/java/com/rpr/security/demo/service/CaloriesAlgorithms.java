package com.rpr.security.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CaloriesAlgorithms {

    public static float getDCN(int height, int weight, int age, char gender) {
        float result = (float) 0.0;
        if (gender == 'M') {
            result = (float) ((10 * weight) + (6.25 * height) - (5 * age) + 5);
        } else if (gender == 'F') {
            result =  (float) ((10 * weight) + (6.25 * height) - (5 * age) - 161);
        }
        return round(result, 3);
    }

    public static float getDCNWithLoads(float DCNValue, float loadValue) {
        return round(DCNValue * loadValue, 3);
    }

    public static float getDCNLoseWeight(float DCNWithLoads) {
        return round((float) (DCNWithLoads - (DCNWithLoads * 0.20)), 3);
    }

    public static float getDCNGainWeight(float DCNWithLoads) {
        return round((float) (DCNWithLoads + (DCNWithLoads * 0.20)), 3);
    }

    public static float getDailyProteins(float DCNWithLoads) {
        return round((float) ((DCNWithLoads * 0.3) / 4), 3);
    }

    public static float getDailyFats(float DCNWithLoads) {
        return round((float) ((DCNWithLoads * 0.3) / 9), 3);
    }

    public static float getDailyСarbohydrates(float DCNWithLoads) {
        return round((float) ((DCNWithLoads * 0.4) / 4), 3);
    }

    public static float round(float value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (float) tmp / factor;
    }
}
