package com.company;

import com.company.award.Award;
import com.company.nominator.Nominator;
import com.company.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
        Award award = new Award(100, 0.75);
        Award award2 = new Award(200, 1);
        Nominee nominee = new Nominee("Soo1");
        Nominator nominator = new Nominator("Chloe1");
        //nominator.nominate(nominee,award);
        nominee.receiveAward(award);
        nominee.receiveAward(award2);
          }
}
