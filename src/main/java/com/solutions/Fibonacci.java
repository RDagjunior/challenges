package com.solutions;

public class Fibonacci {

    static long fiboRecursivo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    static long fibo(int n) {
        long anterior = 0; // anterior
        long atual = 1; // atual

        for (int i = 2; i <= n; i++) {
            atual += anterior;
            anterior = atual - anterior;
        }
        return atual;
    }

    public static void main(String[] args) {

        // teste do programa. Imprime os 8 primeiros termos
        for (int i = 0; i < 8; i++) {
            System.out.print("(" + i + "):" + fibo(i) + " ");
        }

    }

}
