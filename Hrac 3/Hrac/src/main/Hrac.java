/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author st72861
 */
public class Hrac {
    private String jmeno;
    private double hodnoceni;
    private int pocetHer =10;
    private int pocetVyher;
    
    

    public Hrac(String jmeno, double hodnoceni, int pocetVyher) {
        this.jmeno = jmeno;
        this.hodnoceni = hodnoceni;
        this.pocetVyher = pocetVyher;
    }

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
    
    public double vyhernost(){
        
        // double procenta = 0;
        //
        // for(int i = 0; i < pocetHer ; i++){
        //     procenta =  (getPocetHer() / getPocetVyher()) ;
        //
        // }
        double procenta =   (double) getPocetVyher()/getPocetHer();

        System.out.println("vyhernost je: " + jmeno + ":" + " " + procenta + "%");
        return procenta;
    }

    @Override
    public String toString() {
        return "Hrac{" + "jmeno= " + jmeno + ", hodnoceni= " + hodnoceni + ", pocetHer= " + pocetHer + ", pocetVyher= " + pocetVyher + '}';
    }
    
    
    
    
    
}
