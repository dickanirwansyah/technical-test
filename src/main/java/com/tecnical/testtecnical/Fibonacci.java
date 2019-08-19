package com.tecnical.testtecnical;

public class Fibonacci {

    static int bilFib(int inputan){
        int a = 0;
        int b = 1;
        int c = 0;

        for (int i=0; i < inputan; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return c;
    }

    static String ganjilGenap(int inputan){

        //ternary -> inisial = kondisi == ? "result" : "result";

        String result = "";
        result = inputan %2 == 0 ? "Genap" : "Ganjil";
        System.out.print(result);
        return result;
    }

    static String bilPrima(int inputan){

        boolean prima = true;
        String result = "";

        int flag = 0;
        for (int pembagi = 2; pembagi <= inputan / 2; pembagi++){
            flag = inputan % pembagi;
            if (flag == 0){
                prima = false;
                break;
            }
        }

        if (prima && (inputan > 0) && inputan !=1){
            result = inputan+"bilangan prima";
            System.out.print(result);
        }else{
            result = inputan+ "bukan bilang prima";
            System.out.print(result);
        }

        return result;
    }

    public static void main(String[] args){
        bilFib(10);
        ganjilGenap(2);
        bilPrima(7);
    }
}
