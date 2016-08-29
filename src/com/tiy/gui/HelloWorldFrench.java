package com.tiy.gui;

/**
 * Created by DTG2 on 08/29/16.
 */
public class HelloWorldFrench implements HelloWorld {
    String name = "tout le monde";

    public void greet(){
        greetSomeone(name);
    }
    public void greetSomeone(String someone) {
        name = someone;
        System.out.println("Salut " + name);    }
}
