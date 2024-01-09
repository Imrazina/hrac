
package hrac;

public class Hrac implements Comparable<Hrac> {
    private String jmeno;
    private double hodnoceni;
    final int pocetHer = 10;
    private int pocetVyher;
    private boolean Stav;
    

    public Hrac(String jmeno, int pocetVyher) {
        this.jmeno = jmeno;
        this.hodnoceni = hodnoceni;
        this.pocetVyher = pocetVyher;
        this.Stav = false;
    }
    
    public double vyhernost (){
    double vyhernost = (double)pocetVyher/(double)pocetHer*100;
    return vyhernost;
    }

    public void setStav(boolean Stav) {
        this.Stav = Stav;

    }
    public boolean hasStav(){
    return Stav;}

    public String getJmeno() {
        return jmeno;
    }


    public double getHodnoceni() {
       
        return hodnoceni;
    }

    public int getPocetHer() {
        return pocetHer;
    }

    public int getPocetVyher() {
        return pocetVyher;
    }
    


    @Override
    public String toString() {
        return "Hrac{" + "jmeno = " + jmeno + ", hodnoceni = " + (hodnoceni=((double)pocetVyher/(double)pocetHer*100)) + ", "
                + "pocetHer = " + pocetHer + ", pocetVyher = " + pocetVyher +  '}';
    }


    @Override
    public int compareTo(Hrac hracTwo) {
        return this.pocetVyher > hracTwo.getPocetVyher() ? 1 : 0;
    }
}
