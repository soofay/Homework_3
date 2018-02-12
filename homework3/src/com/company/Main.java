package com.company;

import com.company.award.Award;
import com.company.nominator.Nominator;
import com.company.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
        Award award1 = new Award(100, 0.75);
        Nominee nominee1 = new Nominee("Soo1");
        Nominator nominator1 = new Nominator("Chloe1");
        nominator1.nominate(nominee1,award1);

        Award award2 = new Award(50);
        Nominee nominee2 = new Nominee("Soo2");
        Nominator nominator2 = new Nominator("Chloe2");
        nominator1.nominate(nominee2, award2);


          }
}
