package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        Offer offer = new Offer();

        offer.setInfo("turkey", "cydeo","qa", 1500.00,true,true,true,false);

        System.out.println(offer);

        Offer[] offers = {offer};

        ArrayList<Offer> fullTimeOffer = new ArrayList<>(Arrays.asList(offers));

        fullTimeOffer.removeIf(p-> !p.isFullTime);

        System.out.println(fullTimeOffer.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));

        localOffers.removeIf(p->!p.location.equals("va"));



    }


}
