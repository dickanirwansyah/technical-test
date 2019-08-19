package com.tecnical.testtecnical;

public class ReversedNama {


    //Java Programming -> Programming Java
    static void reservedName(String input){
        String[] splitInput = input.split(" ");

        for (int i = splitInput.length - 1; i >= 0; i--){
            System.out.print(splitInput[i] + " ");
        }
    }

    //dengan String Builder
    static void stringBuilderReserve(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        StringBuilder reserveString = stringBuilder.reverse();
        System.out.print(reserveString);
    }

    //fiz buzz jika nilai bisa dibagi 2 maka fiz, jika nilai bisa dibagi 3 buzz, selainnya fizBuzz
    static void fizzBuzz(int inputan){

        String result = "";

        for (int i=0; i <= inputan; i++){

            if (i % 2 == 0){
                result = "fiz";
                System.out.println(result + " - "+i);
            }else if (i % 3 == 0){
                result = "buz";
                System.out.println(result + " - "+i);
            }else{
                result = "FizBuz";
                System.out.println(result + " - "+i);
            }
        }
    }

    public static void main(String[]args){

        reservedName("dicka nirwansyah"+"\n");

        stringBuilderReserve("WelcomeGeeks");

        fizzBuzz(100);
    }
}
