package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileFor {

    public int sum(){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите число");
        int number = in.nextInt();
        for (int i = 1; i <= number; i++ ){
            sum += i;
        }
        return sum;
    }

    public int sumSquare(){
        int sum = 0;
        for (int i = 1; i <= 100; i++ ){
            sum += i*i;
        }
        return sum;
    }

    public long multiplication(){
        int mupl = 1;
        for (int i = 1; i <= 10; i++ ){
            mupl *= i*i;
        }
        return mupl;
    }

    public double numberSeries(double e, int n){
        double a;
        double sum = 0;
        for (int i = 1; i <= n; i++){
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(a) >= e){
                sum += a;
            }
        }
        return  sum;
    }

    public void dividers(int m, int n){
        List<Integer> list = new ArrayList<>();
        for( int i = m; i <= n; i++){
            for(int j = 2; j < i; j++ ){
                if(i % j == 0){
                    list.add(j);
                }
            }
            System.out.print(i + ":" + list);
            list.clear();
            System.out.println();
        }
    }

    public List<Integer> number(int n1, int n2){
        List<Integer> list = new ArrayList<>();


        while (n1 >= 10){
            if(n1 < 10){
                list.add(0,n1);
            }
            list.add(n1%10);
            n1 = n1/10;
        }


        while (n2 >= 10){
            if(n2 < 10){
                list.add(n2);
            }
            list.add(n2%10);
            n2 = n2/10;
        }

        return list;
    }
}
