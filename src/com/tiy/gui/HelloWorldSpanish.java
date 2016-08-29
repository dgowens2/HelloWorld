package com.tiy.gui;

/**
 * Created by DTG2 on 08/29/16.
 */
public class HelloWorldSpanish implements HelloWorld{
    String name = "mundo";

    public void greet(){
        greetSomeone(name);
    }
    public void greetSomeone(String someone) {
        System.out.println("Hola, " + name);
    }
}
