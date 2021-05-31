package com.example;


public class Greeter {

  /** 
   * declaration du message d'accueil 
   */
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
