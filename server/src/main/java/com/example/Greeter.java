package com.example;

/** 
   * Description du message d'accueil 
   */
public class Greeter {

  
  public Greeter() {

  }

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
