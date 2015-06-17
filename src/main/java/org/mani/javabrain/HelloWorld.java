package org.mani.javabrain;
import org.slf4j.*;
public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
       //System.out.println(greeter.sayHello());
Logger logger = LoggerFactory.getLogger(App.class);
logger.info("Hello World!");
    }
}
