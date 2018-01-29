package com.kodilla.kodillacourse;

public class Calculator {

    public int sum(int a, int b){
        return (a + b);
    }

    public int dist(int a, int b){
        return (a - b);
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 9));
    }
}