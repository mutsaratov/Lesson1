package org.example;

import java.util.Scanner;

public class Calculator {
    public static void getCalculate() {

        Scanner in = new Scanner(System.in);
        System.out.println("Write 1st number");
        float firstInt = in.nextFloat();
        String comand;
        do {
            System.out.println("Write next number");
            float nextInt = Calculator.readNum();
            float res = Calculator.calculate(firstInt, nextInt);
            System.out.println("Result is " + res);
            System.out.println("If you want to continue, write \"y\". Else write \"stop\"");
            comand = in.next();
            firstInt = res;
        }
        while (!comand.equals("stop"));
        System.out.println("Bye, Bro");
    }
    public static float calculate(float firstInt, float nextInt) {

        String op = Calculator.readOperation();

        float result=0;
        switch (op) {
            case "+":
                result = firstInt+nextInt;
                break;
            case "-":
                result = firstInt-nextInt;
                break;
            case "*":
                result = firstInt*nextInt;
                break;
            case "/":
                result = firstInt / nextInt;
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
        Scanner in = new Scanner(System.in);
        System.out.println("Write type of operation");
        String operation = in.next();
        while (!operation.equals("+") & !operation.equals("-") & !operation.equals("*") & !operation.equals("/")){
            System.out.println("Wrong operation. Try again");
            operation = in.next();
        }
        return operation;
    }
}
