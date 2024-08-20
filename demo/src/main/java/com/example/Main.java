package com.example;

public class Main {
    public static String imprime() {
        return "Hello World";
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static Boolean ehPar(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println((imprime()));
    }
}