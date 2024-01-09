
package hrac;


public class Kvaifikace {

  private Hrac[] hraci;
  private int pocet;
  private String jmeno;

  public Kvaifikace(String jmeno, int kapacita) {
    this.hraci = new Hrac[kapacita];
    this.pocet = 0;
    this.jmeno = jmeno;
  }

  public void PridejHrace(Hrac hrac) {

    hraci[pocet] = hrac;
    pocet++;


  }

  public void VypisHrace() {
    System.out.println("Soutez " + jmeno);
    for (int i = 0; i < pocet; i++) {
      System.out.println(hraci[i]);
    }
  }


  public void VypisKvalifikantny() {
    for (int i = 0; i < pocet; i++) {
      if (hraci[i].vyhernost() > 75) {
        System.out.println(hraci[i]);
      }
    }
  }

  public double prumernyVykon() {
    int prumer = 0;
    for (int i = 0; i < pocet; i++) {
      prumer += hraci[i].getPocetVyher();

    }
    return prumer / pocet;
  }

  public Hrac getNejlepsi() {
    Hrac Vitez = hraci[0];
    for (int i = 0; i < pocet; i++) {
      if (hraci[i].getPocetVyher() > Vitez.getPocetVyher()) {
        hraci[i] = Vitez;
      }
    }

    return Vitez;
  }

  public void setbool() {
    for (int i = 0; i < pocet; i++) {
      if (hraci[i].vyhernost() > 75) {
        hraci[i].setStav(true);
        System.out.println(hraci[i]);
      }
    }

  }


}
