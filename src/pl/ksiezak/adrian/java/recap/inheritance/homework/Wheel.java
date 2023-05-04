package pl.ksiezak.adrian.java.recap.inheritance.homework;

public class Wheel {
    private int amount;
    private int size;

    public Wheel(int amount, int size) {
        this.amount = amount;
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "amount=" + amount +
                ", size=" + size +
                '}';
    }
}
