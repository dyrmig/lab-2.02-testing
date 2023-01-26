package com.dmitri.lab_202.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] oddArr = oddInts(6);

        for (int numero:
             oddArr) {
            System.out.println(numero);
        }
        String testString = "Don't break my heart";
        System.out.println(testString.indexOf("break"));
    }
    public static int[] oddInts(int number){
        if(number<=0){
            throw new IllegalArgumentException("int cannot be zero or negative");
        }
        int[] intArr = new int[(number+1)/2];
        for (int i = 0, j = 1; i < intArr.length; i++, j += 2) {
            intArr[i] = j;
        }
        return intArr;
    }
    public static boolean javaKeywords(String string){
        if (string.equals("")){
            throw new IllegalArgumentException("String cannot be empty");
        }
        boolean solution = false;
        String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package", "synchronized",
                "boolean", "do", "if", "private", "this", "break", "double", "implements", "protected", "throw",
                "byte", "else", "import", "public", "throws", "case", "enum", "instanceof", "return", "transient",
                "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void",
                "class", "finally", "long", "strictfp", "volatile"};
        String[] inputWords = string.split(" ");
        for (String word: inputWords){
            if(Arrays.asList(keywords).contains(word)){
                solution = true;
            }
        }

        return solution;
    }
}
