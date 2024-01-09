/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 * @author st72861
 */
public class Main {


  public static void main(String[] args) {
    Kvalifikace kv1 = new Kvalifikace("Soutez", 10);

    Hrac h1 = new Hrac("Derek", 10, 4);
    Hrac h2 = new Hrac("Bebrus", 7, 3);
    Hrac h3 = new Hrac("Jan", 5, 1);
    Hrac h4 = new Hrac("Alex", 12, 6);

    // System.out.println(h1);
    // System.out.println(h2);
    // System.out.println(h3);
    // System.out.println(h4);

    kv1.pridejHrace(h1);
    kv1.pridejHrace(h2);
    kv1.pridejHrace(h3);
    kv1.pridejHrace(h4);

    kv1.VypisHrace();

    h1.vyhernost();
    h2.vyhernost();
    h3.vyhernost();
    h4.vyhernost();

    System.out.println("");

    kv1.PrumernyVykon();

    System.out.println("");

    kv1.getNejlepsi();

  }

}
