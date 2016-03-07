package com.goit.gojavaonline.ht4;


import java.io.*;

public class Calculate {

    public static void main(String[] args) throws IOException {

        final double PI = 3.141592;
        double a, b, c, r, p, result;
        String choise;

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Для вычисления площади Треугольника введите \"1\"");
        System.out.println("Для вычисления площади Прямоугольника введите \"2\"");
        System.out.println("Для вычисления площади Круга введите \"3\"");

        choise = bufferedReader.readLine();

        if(Integer.parseInt(choise) == 1){
            System.out.println("Введите значение катетов и гепотинузы треугольника");
            String A = bufferedReader.readLine();
            String B = bufferedReader.readLine();
            String C = bufferedReader.readLine();
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            c = Double.parseDouble(C);
            p = (a + b + c )/2;
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            if(p <= a || p <= b || p <= c ){
                System.out.println("Такого треугольника не существует.");
            }
            else
                System.out.println("Площадь треугольника = "  + result);
        }

        if(Integer.parseInt(choise) == 2){
            System.out.println("Введите значение двух перпендикулярных сторон прямоугольника");
            String A = bufferedReader.readLine();
            String B = bufferedReader.readLine();
            a = Double.parseDouble(A);
            b = Double.parseDouble(B);
            result = a * b;
            if(result <= 0){
                System.out.println("Такого прямоугольника не существует.");
            }
            else
                System.out.println("Плошадь прямоугольника = " + result);
        }

        if(Integer.parseInt(choise) == 3){
            System.out.println("Введите радиус круга");
            String A = bufferedReader.readLine();
            r = Double.parseDouble(A);
            result = PI*r*r;
            if(result <= 0){
                System.out.println("Такого круга не существует.");
            }
            else
                System.out.println("Площадь круга = " + result);
        }

        if (Integer.parseInt(choise) != 1 && Integer.parseInt(choise) !=2 && Integer.parseInt(choise) != 3)
                System.out.println("Некорректный ввол.");
    }


}
