package xyz.monster.event;

public class Cancellable {
    private boolean canceled;

    public Cancellable() {
    }

    public boolean isCancelled() {
        return this.canceled;
    }

    public void setCancelled(boolean canceled) {
        this.canceled = canceled;
    }
}
