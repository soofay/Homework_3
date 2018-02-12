package com.company.nominator;

import com.company.award.Award;
import com.company.nominee.Nominee;

public class Nominator {

    private String name;

    static {
        System.out.println("Nominator is initialized");
    }

    public Nominator(String name) {
        this.name = name;
    }

    public void nominate(Nominee nominee, Award award) {
        System.out.println("Recipient name is " + nominee.getName());
       // System.out.println("Award amount is " + award.getValue());
        nominee.receiveAward();
    }
}
