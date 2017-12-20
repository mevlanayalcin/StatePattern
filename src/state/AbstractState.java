package state;

import metro.turnikesi.Turnike;

public abstract class AbstractState
{
    Turnike turnike;

    public  AbstractState(Turnike t)
    {
        this.turnike=t;
    }

    public abstract void odemeBasarili();
    public abstract void odemeBasarisiz();
    public abstract void turnikedenGir();

}
