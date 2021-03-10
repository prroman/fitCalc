package com.rpr.security.demo.model;

public class CalculatorResult {

    private String name;
    private int age;
    private int height;
    private int weight;
    private char gender;
    private float loadValue;
    private float dailyCaloriesNormValue;
    private float dailyCaloriesNormWithLoadsValue;

    private float dailyCaloriesNormToLoseWeightValue;
    private float dailyCaloriesNormToGainWeightValue;

    private float dailyProteinsToLoseWeightValue;
    private float dailyFatsToLoseWeightValue;
    private float dailyСarbohydratesToLoseWeightValue;

    private float dailyProteinsOriginValue;
    private float dailyFatsOriginValue;
    private float dailyСarbohydratesOriginValue;

    private float dailyProteinsToGainWeightValue;
    private float dailyFatsToGainWeightValue;
    private float dailyСarbohydratesToGainWeightValue;

    public CalculatorResult() {
    }

    public CalculatorResult(String name, int age, int height, int weight, char gender, float loadValue,
                            float dailyCaloriesNormValue, float dailyCaloriesNormWithLoadsValue, float dailyCaloriesNormToLoseWeightValue,
                            float dailyCaloriesNormToGainWeightValue, float dailyProteinsToLoseWeightValue, float dailyFatsToLoseWeightValue,
                            float dailyСarbohydratesToLoseWeightValue, float dailyProteinsOriginValue, float dailyFatsOriginValue, float dailyСarbohydratesOriginValue,
                            float dailyProteinsToGainWeightValue, float dailyFatsToGainWeightValue, float dailyСarbohydratesToGainWeightValue) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.loadValue = loadValue;
        this.dailyCaloriesNormValue = dailyCaloriesNormValue;
        this.dailyCaloriesNormWithLoadsValue = dailyCaloriesNormWithLoadsValue;
        this.dailyCaloriesNormToLoseWeightValue = dailyCaloriesNormToLoseWeightValue;
        this.dailyCaloriesNormToGainWeightValue = dailyCaloriesNormToGainWeightValue;
        this.dailyProteinsToLoseWeightValue = dailyProteinsToLoseWeightValue;
        this.dailyFatsToLoseWeightValue = dailyFatsToLoseWeightValue;
        this.dailyСarbohydratesToLoseWeightValue = dailyСarbohydratesToLoseWeightValue;
        this.dailyProteinsOriginValue = dailyProteinsOriginValue;
        this.dailyFatsOriginValue = dailyFatsOriginValue;
        this.dailyСarbohydratesOriginValue = dailyСarbohydratesOriginValue;
        this.dailyProteinsToGainWeightValue = dailyProteinsToGainWeightValue;
        this.dailyFatsToGainWeightValue = dailyFatsToGainWeightValue;
        this.dailyСarbohydratesToGainWeightValue = dailyСarbohydratesToGainWeightValue;
    }

    public String getName() {
        return name;
    }

    public CalculatorResult setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public CalculatorResult setAge(int age) {
        this.age = age;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public CalculatorResult setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public CalculatorResult setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public char getGender() {
        return gender;
    }

    public CalculatorResult setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public float getLoadValue() {
        return loadValue;
    }

    public CalculatorResult setLoadValue(float loadValue) {
        this.loadValue = loadValue;
        return this;
    }

    public float getDailyCaloriesNormValue() {
        return dailyCaloriesNormValue;
    }

    public CalculatorResult setDailyCaloriesNormValue(float dailyCaloriesNormValue) {
        this.dailyCaloriesNormValue = dailyCaloriesNormValue;
        return this;
    }

    public float getDailyCaloriesNormWithLoadsValue() {
        return dailyCaloriesNormWithLoadsValue;
    }

    public CalculatorResult setDailyCaloriesNormWithLoadsValue(float dailyCaloriesNormWithLoadsValue) {
        this.dailyCaloriesNormWithLoadsValue = dailyCaloriesNormWithLoadsValue;
        return this;
    }

    public float getDailyCaloriesNormToLoseWeightValue() {
        return dailyCaloriesNormToLoseWeightValue;
    }

    public CalculatorResult setDailyCaloriesNormToLoseWeightValue(float dailyCaloriesNormToLoseWeightValue) {
        this.dailyCaloriesNormToLoseWeightValue = dailyCaloriesNormToLoseWeightValue;
        return this;
    }

    public float getDailyCaloriesNormToGainWeightValue() {
        return dailyCaloriesNormToGainWeightValue;
    }

    public CalculatorResult setDailyCaloriesNormToGainWeightValue(float dailyCaloriesNormToGainWeightValue) {
        this.dailyCaloriesNormToGainWeightValue = dailyCaloriesNormToGainWeightValue;
        return this;
    }

    public float getDailyProteinsToLoseWeightValue() {
        return dailyProteinsToLoseWeightValue;
    }

    public CalculatorResult setDailyProteinsToLoseWeightValue(float dailyProteinsToLoseWeightValue) {
        this.dailyProteinsToLoseWeightValue = dailyProteinsToLoseWeightValue;
        return this;
    }

    public float getDailyFatsToLoseWeightValue() {
        return dailyFatsToLoseWeightValue;
    }

    public CalculatorResult setDailyFatsToLoseWeightValue(float dailyFatsToLoseWeightValue) {
        this.dailyFatsToLoseWeightValue = dailyFatsToLoseWeightValue;
        return this;
    }

    public float getDailyСarbohydratesToLoseWeightValue() {
        return dailyСarbohydratesToLoseWeightValue;
    }

    public CalculatorResult setDailyСarbohydratesToLoseWeightValue(float dailyСarbohydratesToLoseWeightValue) {
        this.dailyСarbohydratesToLoseWeightValue = dailyСarbohydratesToLoseWeightValue;
        return this;
    }

    public float getDailyProteinsOriginValue() {
        return dailyProteinsOriginValue;
    }

    public CalculatorResult setDailyProteinsOriginValue(float dailyProteinsOriginValue) {
        this.dailyProteinsOriginValue = dailyProteinsOriginValue;
        return this;
    }

    public float getDailyFatsOriginValue() {
        return dailyFatsOriginValue;
    }

    public CalculatorResult setDailyFatsOriginValue(float dailyFatsOriginValue) {
        this.dailyFatsOriginValue = dailyFatsOriginValue;
        return this;
    }

    public float getDailyСarbohydratesOriginValue() {
        return dailyСarbohydratesOriginValue;
    }

    public CalculatorResult setDailyСarbohydratesOriginValue(float dailyСarbohydratesOriginValue) {
        this.dailyСarbohydratesOriginValue = dailyСarbohydratesOriginValue;
        return this;
    }

    public float getDailyProteinsToGainWeightValue() {
        return dailyProteinsToGainWeightValue;
    }

    public CalculatorResult setDailyProteinsToGainWeightValue(float dailyProteinsToGainWeightValue) {
        this.dailyProteinsToGainWeightValue = dailyProteinsToGainWeightValue;
        return this;
    }

    public float getDailyFatsToGainWeightValue() {
        return dailyFatsToGainWeightValue;
    }

    public CalculatorResult setDailyFatsToGainWeightValue(float dailyFatsToGainWeightValue) {
        this.dailyFatsToGainWeightValue = dailyFatsToGainWeightValue;
        return this;
    }

    public float getDailyСarbohydratesToGainWeightValue() {
        return dailyСarbohydratesToGainWeightValue;
    }

    public CalculatorResult setDailyСarbohydratesToGainWeightValue(float dailyСarbohydratesToGainWeightValue) {
        this.dailyСarbohydratesToGainWeightValue = dailyСarbohydratesToGainWeightValue;
        return this;
    }

    @Override
    public String toString() {
        return "ResultSet [dailyCaloriesNormValue=" + dailyCaloriesNormValue + ", dailyCaloriesNormWithLoadsValue="
                + dailyCaloriesNormWithLoadsValue + ", dailyCaloriesNormToLoseWeightValue="
                + dailyCaloriesNormToLoseWeightValue + ", dailyCaloriesNormToGainWeightValue="
                + dailyCaloriesNormToGainWeightValue + ", dailyProteinsToLoseWeightValue="
                + dailyProteinsToLoseWeightValue + ", dailyFatsToLoseWeightValue=" + dailyFatsToLoseWeightValue
                + ", dailyСarbohydratesToLoseWeightValue=" + dailyСarbohydratesToLoseWeightValue
                + ", dailyProteinsOriginValue=" + dailyProteinsOriginValue + ", dailyFatsOriginValue="
                + dailyFatsOriginValue + ", dailyСarbohydratesOriginValue=" + dailyСarbohydratesOriginValue
                + ", dailyProteinsToGainWeightValue=" + dailyProteinsToGainWeightValue + ", dailyFatsToGainWeightValue="
                + dailyFatsToGainWeightValue + ", dailyСarbohydratesToGainWeightValue="
                + dailyСarbohydratesToGainWeightValue + "]";
    }
}
