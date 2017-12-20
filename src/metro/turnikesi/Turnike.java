package metro.turnikesi;

import state.AbstractState;
import state.KapaliTurnikeState;

public class Turnike
{
    public AbstractState getAbstractState() {
        return abstractState;
    }

    AbstractState abstractState;

    public Turnike()
    {
        this.abstractState=new KapaliTurnikeState(this);//turnike normalde kapalı
    }

    public void odemeBasarili()
    {
        this.abstractState.odemeBasarili();
    }

    public void odemeBasarisiz()
    {
        this.abstractState.odemeBasarisiz();
    }


    public void turnikedenGir()
    {
        this.abstractState.turnikedenGir();
    }

    public void stateDegistir(AbstractState abstractState1)
    {
        this.abstractState=abstractState1;
    }

}
