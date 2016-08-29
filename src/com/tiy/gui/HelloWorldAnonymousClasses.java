package com.tiy.gui;

/**
 * Created by DTG2 on 08/29/16.
 */
public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();

        HelloWorld frenchGreeting = new HelloWorld() {/*this is called an anonymous class. it is used in-line.*/
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {  /*Does exactly what the English version does, but is faster and no reusable.*/
                name = someone;
                System.out.println("Salut " + name);
            }
        };                                              /*called anonymous because you can't reuse it. It doesn't have a name.*/
/*Anonymous classes aren't a new instance of an interface. That can't be done. The entire thing is an implementation
 * of the "HelloWorld" interface. After the expression is created, then the entire expression can be instantiated, hence the }:
  * at the bottom.*/

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
                new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }

}
