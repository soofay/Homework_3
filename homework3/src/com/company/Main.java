package com.company;

import com.company.award.Award;
import com.company.nominator.Nominator;
import com.company.nominee.Nominee;

public class Main {

    public static void main(String[] args) {

        Nominator nominator1 = new Nominator("Chloe");
        Nominee nominee1 = new Nominee("Soo");
        Award award1 = new Award(100, 0.75);
        nominator1.nominate(nominator1, nominee1, award1);
        nominee1.receiveAward(award1);

        Award award2 = new Award(70);
        nominator1.nominate(nominator1, nominee1, award2);
        nominee1.receiveAward(award2);

        Nominee nominee2 = new Nominee("Yena");
        Award award3 = new Award( 100, 1.5);
        nominator1.nominate(nominator1, nominee2, award3);
        nominee2.receiveAward(award3);

        Award award4 = new Award(200);
        nominator1.nominate(nominator1, nominee2, award4);
        nominee2.receiveAward(award4);

        Award award5 = new Award(50, 2);
        Nominator nominator2 = new Nominator("Kira");
        Nominee nominee3 = new Nominee( "Mila");
        nominator2.nominate(nominator2, nominee3, award5);
        nominee3.receiveAward(award5);

        Award award6 = new Award(50, 0.5);
        nominator2.nominate(nominator2, nominee3, award6);
        nominee3.receiveAward(award6);

        nominator1.nominate(nominator1, nominee3,award2);
        nominee2.receiveAward(award2);

        nominator1.nominate(nominator1, nominee3,award4);
        nominee2.receiveAward(award4);

        nominator1.nominate(nominator1, nominee3,award2);
        nominee2.receiveAward(award2);



     }
}
