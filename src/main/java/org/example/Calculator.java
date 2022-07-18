package org.example;

import java.util.Scanner;

public class Calculator {
    public static void getCalculate() {

        Scanner in = new Scanner(System.in);
        System.out.println("Write 1st number");
        float firstNum = in.nextFloat();
        String comand;
        do {
            System.out.println("Write next number");
            float nextNum = readNum();
            float res = calculate(firstNum, nextNum);
            System.out.println("Result is " + res);
            System.out.println("If you want to continue, write \"y\". Else write \"stop\"");
            comand = in.next();
            firstNum = res;
        }
        while (!comand.toLowerCase().equals("stop"));
        System.out.println("Bye, Bro");
    }
    public static float calculate(float firstNum, float nextNum) {

        String op = readOperation();

        float result=0;
        switch (op) {
            case "+":
                result = firstNum + nextNum;
                break;
            case "-":
                result = firstNum - nextNum;
                break;
            case "*":
                result = firstNum * nextNum;
                break;
            case "/":
                result = firstNum / nextNum;
                break;
            case "%":
                result = firstNum % nextNum;
                break;
        }
        return result;
    }

    public static float readNum(){
        Scanner in = new Scanner(System.in);
        float num2 = in.nextFloat();
        while (num2 == 0){
            System.out.println("Can't divide by zero. If you aren't going to use \"/\" operation, type \"go\"");
            String ans = in.next();
            if (!ans.equals("go")){
                System.out.println("Write another number");
                num2 = in.nextFloat();
            } else {
                num2 = 0;
            }
            break;
        }
        return num2;
        }

    public static String readOperation(){
        int a = 0;
        String[] opArr = new String[]{"+","-","/","*","%"};
        Scanner in = new Scanner(System.in);
        System.out.println("Write type of operation");
        String operation = in.next();

        for (int i = 0; i < opArr.length; i++) {
            if (!operation.equals(opArr[i])){
                a+=1;
            }
        }
        if (a == opArr.length){
            System.out.println("Wrong operation");
            operation = readOperation();
        }
        return operation;
    }
}
