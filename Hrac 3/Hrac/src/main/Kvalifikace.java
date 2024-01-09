/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 * @author st72861
 */
public class Kvalifikace {

  private Hrac[] hraci;
  private int pocet;
  private String nazev;

  public Kvalifikace(String nazev, int kapacita) {
    this.nazev = nazev;
    this.hraci = new Hrac[kapacita];

  }

  public void pridejHrace(Hrac hrac) {
    hraci[pocet] = hrac;
    pocet++;

  }

  public void VypisHrace() {
    System.out.println("Nazev: " + nazev);
    for (int i = 0; i < pocet; i++) {
      System.out.println(hraci[i]);
    }
  }

  public double PrumernyVykon() {
    double sum = 0;
    double prumer = 0;

    for (int i = 0; i < pocet; i++) {
      sum += hraci[i].getPocetVyher();
    }
    prumer = sum / pocet;

    System.out.println("Prumerna vyhernost Hracu: " + prumer);
    return prumer;
  }

  public Hrac getNejlepsi() {
    Hrac lepsi = hraci[0];
    for (int i = 0; i < pocet; i++) {
        if (hraci[0].getPocetVyher() < hraci[i].getPocetVyher()) {
            lepsi = hraci[i];
        }
    }

    System.out.println("Nejlepsi je: " + lepsi);
    return lepsi;
  }


}
