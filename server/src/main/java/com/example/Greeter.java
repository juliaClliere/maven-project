package com.example;
/**
 * My <b>class</b>.
 * Fonctionnalités pour les salutations
 */
public class Greeter {
  /**
  * My <b>constructor</b>.
  * default constructor
  */
  public Greeter() {
  }
  /**
  * * My <b>method</b>.
  * @param someone String
  * @return String
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
