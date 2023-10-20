package com.bilgee.demo;

import static com.bilgee.demo.Counter.*;
import static com.bilgee.demo.Counter.counterStatic;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        counter.counter(); // Instance
        counterStatic(); // Static reference method


    }
}
