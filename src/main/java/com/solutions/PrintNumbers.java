package com.solutions;

public class PrintNumbers {
    static int i = 1;

    public static void main(String[] args) {
        printNumbers();
    }

    private static void printNumbers() {
        if (i <= 500) {
            System.out.print(i++ + " ");
            printNumbers();
        }
    }
}
