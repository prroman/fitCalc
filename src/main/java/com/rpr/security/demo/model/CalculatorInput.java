package com.rpr.security.demo.model;

public class CalculatorInput {

    private String name;
    private int age;
    private int height; //cm
    private int weight; //kg
    private char gender; //[M]ale | [F]emale
    private float loadValue; // 1.2, 1.375, 1.4625, 1.550, 1.6375, 1.725, 1.9

    public CalculatorInput() {}
    public CalculatorInput(String name, int age, int height, int weight, char gender, float loadValue) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.loadValue = loadValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getLoadValue() {
        return loadValue;
    }

    public void setLoadValue(float loadValue) {
        this.loadValue = loadValue;
    }

    @Override
    public String toString() {
        return "CalculatorsInput{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", gender=" + gender +
                '}';
    }
}
