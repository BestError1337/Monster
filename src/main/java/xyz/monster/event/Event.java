package xyz.monster.event;


import xyz.monster.Monster;

public class Event extends Cancellable
{
    public EventDirection eventDirection;

    public void call()
    {
        Monster.INSTANCE.moduleManager.handleEvent(this);
    }
}
