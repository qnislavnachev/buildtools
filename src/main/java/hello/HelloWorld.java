package hello;

import org.apache.log4j.Logger;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        Logger log = Logger.getLogger(HelloWorld.class);
        log.info("Welcome to the system!");

    }
}
