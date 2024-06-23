package Lesson13;

public class Loans {
    private Long id;
    private double amount;
    private int percent;
    private BankAccount bankAccount;

    public Loans(Long id, double amount, int percent) {
        this.id = id;
        this.amount = amount;
        this.percent = percent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Loans{" +
                "id=" + id +
                ", amount=" + amount +
                ", percent=" + percent +
                '}';
    }

}
