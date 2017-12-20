package test;

import metro.turnikesi.Turnike;

public class Test
{
    public static void main(String[] args)
    {
        Turnike turnike=new Turnike();
        //Şu an default olarak kapılar kapalı
        //Hangi statede olduğumuzu görelim ilk sonra state değişimi yapalım
        System.out.println("Şu an "+turnike.getAbstractState()+" durumundasınız ");
        turnike.odemeBasarili();
        System.out.println("Şu an "+turnike.getAbstractState()+" durumundasınız ");
        turnike.turnikedenGir();
        System.out.println("Şu an "+turnike.getAbstractState()+" durumundasınız ");
    }
}
