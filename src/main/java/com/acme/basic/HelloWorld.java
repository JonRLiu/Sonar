package com.acme.basic;

public class HelloWorld {

  String sayHello() {
    System.out.println("Hello World!");
    return "Hello World!";
  }

  String notCovered() {
    System.out.println("This method is not covered by unit tests");
    return "This method is not covered by unit tests";
  }

}
