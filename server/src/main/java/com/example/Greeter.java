package com.example;


public class Greeter {

  /** 
   * cette class permet de declarer notre objet
   */
  public Greeter() {

  }
  
/** 
   * Affichage de ma methode
   */
  public final String greet(final String someone) {
    
    /** 
   * Affichage de mon message d'accueil
   */
    return String.format("Hello babacar, %s!", someone);
  }
}
