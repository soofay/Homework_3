package com.company.award;

public class Award {

    private final int value;
    private double soli;

  static {
     System.out.println("Award is initialized");
   }

    public Award(int value, double soli) {
        this.value = value;
        this.soli = soli;


    }
    public double getSoli() {
        return this.soli;
    }

    public void setSoli(double soli) {
        this.soli = soli; // I missed this before!!
    }

    public Award(int value) {
       this.value = value;
    }

     public int getValue() {
        return this.value;
    }

}