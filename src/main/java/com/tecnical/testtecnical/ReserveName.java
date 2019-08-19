package com.tecnical.testtecnical;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ReserveName {

    //Java Programming (each word) -> avaJ gnimmargorP
    static String reservedEachWord(String input){
        String[] splitInput = input.split(" ");
        String resultReserved = "";

        for (int i=0; i < splitInput.length; i++){

            String words = splitInput[i];
            String reWords = "";

            for (int j=words.length() - 1; j >= 0; j--){
                reWords = reWords + words.charAt(j);
            }

            resultReserved = resultReserved + reWords + " ";
        }

        System.out.print(resultReserved);
        return resultReserved;
    }


    //My Name Is Dicka -> Dicka Is Name My
    static String reservedWord(String input){
        String[] splitWord = input.split(" ");
        String result = "";

        //ini hasil normal
        for (int i=0; i < splitWord.length; i++){
            //System.out.print(splitWord[i]);
        }

        //tinggal dibalik
        for (int i=splitWord.length - 1; i >=0; i--){
            System.out.print(splitWord[i]+" ");
        }

        return result;
    }


    //fibonacci
    static int fibonacci(int inputan){

       int a = 0;
       int b = 1;
       int c = 0;

       for (int i=1; i <= inputan; i++){
           c = a + b;
           a = b;
           b = c;
           System.out.print(c + " ");
       }
       return c;
    }

    public static void main(String[] args){

        reservedEachWord("Muhammad Dicka Nirwansyah Ganteng");

        reservedWord("My Name Is Dicka");

        fibonacci(10);
    }
}
