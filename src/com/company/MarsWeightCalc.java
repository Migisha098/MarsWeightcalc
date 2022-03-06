package com.company;

public class MarsWeightCalc {
    public static void main(String[] args) {

        float earthWeightMigisha;
        float marsWeightMigisha ;
        double marsWeightMigishaInDouble ;
        int marsWeightMigishaInInt ;

        earthWeightMigisha = 62;
        marsWeightMigisha = (earthWeightMigisha * 0.38F);
        System.out.println(earthWeightMigisha + "kg on Earth is" + marsWeightMigisha + "kg on Mars");

        //assigment (compatible types) from float to double
        marsWeightMigishaInDouble = marsWeightMigisha ;
        System.out.println("Kilograms on Mars after converting to double " + marsWeightMigishaInDouble);
        //printing a variable limiting the length of printing to 4 decimal places
        System.out.printf("kilograms on Mars displayed to four decimal places :%.4f %n",marsWeightMigishaInDouble);

        // a floating point type cast to integer
        marsWeightMigishaInInt = (int)marsWeightMigishaInDouble;
        System.out.println("kilograms on Mars casted to integer" + marsWeightMigishaInInt);

        //casting an integer type to character
         char c = (char) marsWeightMigishaInInt;
        System.out.println("The ASCII table equivalent of marsWeight is : "+ c);

        // assign the value of performing mathematical operation on the char character to the int variable
         int exampleOfMathOnChar = c + c ;
        System.out.println("An example of a mathematical on the char type : " + exampleOfMathOnChar);





    }
}
