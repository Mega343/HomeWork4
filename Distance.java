package com.goit.gojavaonline.ht4;


import java.io.*;


public class Distance {


    public static void main(String[] args) throws IOException {
        System.out.println("Введите значения координат первой(х1, у1) и второй точки(х2, у2)");
        System.out.println("Расстояние между точками " + calcDistance());
    }



   public static double calcDistance() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       double x1 = Double.parseDouble(reader.readLine());
       double y1 = Double.parseDouble(reader.readLine());
       double x2 = Double.parseDouble(reader.readLine());
       double y2 = Double.parseDouble(reader.readLine());
       double distance = Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2 - y1),2)));
       return distance;
   }
}
