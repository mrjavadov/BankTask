package Lesson13;

public class Card {
    private Long id;
    private Long carNumber;
    private short cvv;
    private BankAccount bankAccount;


    public Card(Long id, Long carNumber, short cvv) {
        this.id = id;
        this.carNumber = carNumber;
        this.cvv = cvv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Long carNumber) {
        this.carNumber = carNumber;
    }

    public short getCvv() {
        return cvv;
    }

    public void setCvv(short cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", carNumber=" + carNumber +
                ", cvv=" + cvv +
                '}';
    }
}
