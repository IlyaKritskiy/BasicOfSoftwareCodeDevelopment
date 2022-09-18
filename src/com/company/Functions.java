package com.company;

public class Functions {

    public double firstFunction(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }

    public double secondFunction(double a, double b, double c) {
        return ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a)) - a * a * a * c + (1 / (b * b));
    }

    public double thirdFunction(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }


    public double fourthFunction(double R) {
        return (R * 1000) % 1000 + (int) R / 1000.0;
    }


    public void fifthFunction(int number) {
        int hour;
        int min;
        int sec;
        hour = number / 3600;
        int decHour = hour / 10;
        int unitHour = hour % 10 ;
        min = (number - 3600 * hour) / 60;
        int decMin = min / 10;
        int unitMin = min % 10;
        sec = number - 3600 * hour - 60 * min;
        int decSec = sec / 10;
        int unitSec = sec % 10;

        System.out.println(decHour + unitHour + " ч " + decMin + unitMin + " мин " + decSec + unitSec + " сек ");
    }

    public boolean sixFunction(int x, int y){
        boolean result = false;
        if(y < 0 && y > -3){
           result = x >= -4 && x <= 4;
       } else if(y >= 0 && y <= 4) {
           result = x >= -2 && x <= 2;
       }
       return result;
    }
}
