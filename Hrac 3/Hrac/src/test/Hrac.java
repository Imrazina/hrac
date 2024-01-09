package test;

public class Hrac {

  private String jmeno;
  private double hodnoceni;
  final int pocetHer = 10;
  private int pocetVyher;
  private boolean Stav;

  public Hrac(String jmeno, double hodnoceni) {
    this.jmeno = jmeno;
    this.hodnoceni = hodnoceni;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public double getHodnoceni() {
    return hodnoceni;
  }

  public void setHodnoceni(double hodnoceni) {
    this.hodnoceni = hodnoceni;
  }

  public int getPocetHer() {
    return pocetHer;
  }

  public int getPocetVyher() {
    return pocetVyher;
  }

  public void setPocetVyher(int pocetVyher) {
    this.pocetVyher = pocetVyher;
  }

  public boolean isStav() {
    return Stav;
  }

  public void setStav(boolean stav) {
    Stav = stav;
  }

  public double vyhernost() {
    return (double)pocetVyher/pocetHer*100;
  }

  @Override
  public String toString() {
    return "Hrac{" +
        "jmeno='" + jmeno + '\'' +
        ", hodnoceni=" + hodnoceni +
        ", pocetHer=" + pocetHer +
        ", pocetVyher=" + pocetVyher +
        ", Stav=" + Stav +
        '}';
  }
}
