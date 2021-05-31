package com.example;


public class Greeter {

  /** 
   * cette classe permet de declarer notre objet
   */
  public Greeter() {

  }
  
/** 
   * Affichage de mon message d'accueil
   */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
