package com.company;

public class Main {

    public static void main(String[] args) {

        Functions functions = new Functions();
        System.out.println(functions.firstFunction(3, 4, 5));
        System.out.println(functions.secondFunction(3,4,5));
        System.out.println(functions.thirdFunction(2,3));
        System.out.println(functions.fourthFunction(449.917));
        functions.fifthFunction(123);
        System.out.println(functions.sixFunction(-2,4));

        System.out.println("-----------------------");

        IfElse function = new IfElse();
        function.isTriangle(45,45);
        System.out.println(function.isline(0, 4, 3, 5, 9, 7));
        System.out.println(function.brick(7,5,7,4,12));
        System.out.println(function.function(5));

        System.out.println("-----------------------");

        WhileFor function3 = new WhileFor();
        System.out.println(function3.sum());
        System.out.println(function3.sumSquare());
        System.out.println(function3.multiplication());
        System.out.println(function3.numberSeries(0.25,2));
        function3.dividers(10,20);
        System.out.println(function3.number(678, 290));
    }
}
