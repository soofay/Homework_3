package com.company.nominator;

import com.company.award.Award;
import com.company.nominee.Nominee;

public class Nominator {

    private String name;

    static {
        //System.out.println("Nominator is initialized");
    }

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Nominator nominator, Nominee nominee, Award award ) {
        System.out.println("Nominator's name is " + nominator.name);
        System.out.println("Recipient's name is " + nominee.getName());
        //System.out.println("The nominated Award amount is " + award.getValue());

    }
}
