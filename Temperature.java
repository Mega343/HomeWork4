package com.goit.gojavaonline.ht4;


import java.io.*;

public class Temperature{

    static double  tc;
    static double tf ;

    public static void main(String[] args) throws IOException {
        System.out.println(calcTf());
        System.out.println(calcTc());
    }

  public static double calcTc() throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      double tf = Double.parseDouble(reader.readLine());
        tc = (5 * (tf - 32))/9;
       return tc;
    }

  public static double calcTf() throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      double tc = Double.parseDouble(reader.readLine());
       tf = (1.8* tc + 32);
       return tf;
   }
}
