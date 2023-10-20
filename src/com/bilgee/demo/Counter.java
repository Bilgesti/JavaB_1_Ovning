package com.bilgee.demo;

public class Counter {
 int countValue = 0;

    public void counter(){
        System.out.println(countValue);
        countValue++;
        System.out.println(countValue);
    }
    public static void counterStatic(){
        System.out.println(countValue);
         countValue++;
        System.out.println(countValue);
    }
}
