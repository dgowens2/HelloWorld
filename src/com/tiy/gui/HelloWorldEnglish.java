package com.tiy.gui;

/**
 * Created by DTG2 on 08/29/16.
 */
public class HelloWorldEnglish implements HelloWorld {
    String name = "world";

    public void greet(){
        greetSomeone(name);
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Hello " + name);
    }
}
