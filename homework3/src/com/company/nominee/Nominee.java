package com.company.nominee;

import com.company.award.Award;

import java.util.Random;

public class Nominee {

    private String name ;

    static {
        System.out.println("Nominee is initialized");
    }

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void receiveAward(Award award) {
        if (award.getSoli() != 1) {

            System.out.println("The original Award amount before SOLI applied is " + award.getValue());
            System.out.println("The soli value is " + award.getSoli());
            double awardWithSoli = award.getValue() * award.getSoli(); //I missed this before!!
            System.out.println("The Award amount with soli is " + awardWithSoli);
            if (award.getValue() >= awardWithSoli) {
                System.out.println("The final award has been decreased " + "by " + ((award.getValue() - awardWithSoli)/award.getValue())*100 + "%.");
            } else

                System.out.println("The final award has been increased " + "by " + ((awardWithSoli - award.getValue())/award.getValue())*100 + "%.");
        }

         else{
                Random rm = new Random();
                int c = rm.nextInt(2);
                int Z = rm.nextInt(6);
                //C = a random decimal i.e. 5% = 0.05
                int P = award.getValue();
                int population =  3;
                //population = total count of employee's awards without soli
                int quantity = ((Z^2*(P)*(1-P))/(c^2)) / (1 + ((((Z^2*(P)*(1-P ))/(c^2))-1)/population));

            System.out.println("The Award amount is " + award.getValue() + " and note that soli is not used.");
            System.out.println("The quantity is " + quantity);
            }

            }

        }

}