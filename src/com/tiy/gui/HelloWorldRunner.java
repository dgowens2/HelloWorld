package com.tiy.gui;

/**
 * Created by DTG2 on 08/29/16.
 */
public class HelloWorldRunner {

    public static void main(String... args) {
        HelloWorldEnglish myEnglishApp = new HelloWorldEnglish();
        myEnglishApp.greet();
        HelloWorldSpanish mySpanishApp = new HelloWorldSpanish();
        mySpanishApp.greet();
        HelloWorldFrench myFrenchApp = new HelloWorldFrench();
        myFrenchApp.greetSomeone("Fred");
    }
}
