public class Atm implements AtmState {

    int cashStock;
    AtmState currentState;

    public Atm() {
        currentState = new NoCash(this);
    }

    public int getCashStock() {
        return cashStock;
    }

    public void setCashStock(int cashStock) {
        this.cashStock = cashStock;
    }

    public void setState(AtmState state) {
        currentState = state;
    }

    public AtmState getState() {
        return currentState;
    }

    public void withdraw(int amount) {
        currentState.withdraw(amount);
    }

    public void refill(int amount) {
        currentState.refill(amount);
    }
}