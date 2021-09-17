package com.solutions;

public class RevertWord {
    static int i;

    public static void main(String[] args) {
        String teste = "Teste maluco bolado doidao";
        char[] word = teste.toCharArray();
        i = word.length - 1;
        reversetWordRecursive(teste.toCharArray());
        System.out.println("");
        reversetWord(word);
    }

    private static void reversetWordRecursive(char[] word) {
        if (i >= 0) {
            System.out.print(word[i--]);
            reversetWordRecursive(word);
        }
    }

    private static void reversetWord(char[] word) {
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]);
        }
    }


}
