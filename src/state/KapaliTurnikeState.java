package state;

import metro.turnikesi.Turnike;

public class KapaliTurnikeState extends AbstractState
{

    public KapaliTurnikeState(Turnike t)
    {
        super(t);
    }

    @Override
    public void odemeBasarili()
    {
        System.out.println("Ödeme başarılı turnikeden geçiniz...");
        this.turnike.stateDegistir(new AcikTurnikeState(this.turnike));
    }

    @Override
    public void odemeBasarisiz()
    {
        System.out.println("Ödeme başarısız kartınızı tekrar okutunuz...");
        this.turnike.stateDegistir(new KapaliTurnikeState(this.turnike));
    }

    @Override
    public void turnikedenGir()
    {
        System.out.println("Turnikeden geçiyorsunuz şu anda.Geçtikten sonra turnike kapanacaktır...");
        this.turnike.stateDegistir(new KapaliTurnikeState(this.turnike));
    }


}
