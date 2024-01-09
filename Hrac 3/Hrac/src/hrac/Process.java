package hrac;

public class Process {

  public static void main(String[] args) {
    Kvaifikace kval = new Kvaifikace("FIFA", 10);

    Hrac a1 = new Hrac("Lukas", 10);
    Hrac a2 = new Hrac("Solomon", 7);
    Hrac a3 = new Hrac("Amanda", 4);

    kval.PridejHrace(a1);
    kval.PridejHrace(a2);
    kval.PridejHrace(a3);

    kval.VypisHrace();
    System.out.println(" ");

    double PM = kval.prumernyVykon();
    System.out.println("Prumerna vyhornost hracu: " + PM);
    System.out.println(" ");

    Hrac Vitez = kval.getNejlepsi();
    System.out.println("Nejlepsi hrac je: " +  Vitez.getJmeno());
    System.out.println(" ");

    kval.setbool();

    System.out.println(a1.getJmeno() + (a1.hasStav() ? " je kvalifikovan" : " je loch"));
    System.out.println(a2.getJmeno() + (a2.hasStav() ? " je kvalifikovan" : " je loch"));
    System.out.println(a3.getJmeno() + (a3.hasStav() ? " je kvalifikovan" : " je loch"));
    System.out.println(" ");

    System.out.print("Vypis kvalifikovanych hracu: ");
    kval.VypisKvalifikantny();


  }


  private double getOrumer(Hrac hrac) {
    return (double) hrac.getPocetVyher() /hrac.getPocetHer();
  }
}
