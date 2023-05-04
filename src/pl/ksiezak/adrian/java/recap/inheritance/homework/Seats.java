package pl.ksiezak.adrian.java.recap.inheritance.homework;

public class Seats {
    private int amount;

    public Seats(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "amount=" + amount +
                '}';
    }
}
