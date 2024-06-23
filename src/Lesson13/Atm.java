package Lesson13;

public class Atm {
    private Long id;
    private Long amounMoney;
    private Bank bank;
    private AtmWithDrawEmployees atmWithDrawEmployees;

    public Atm(Long id, Long amounMoney) {
        this.id = id;
        this.amounMoney = amounMoney;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmounMoney() {
        return amounMoney;
    }

    public void setAmounMoney(Long amounMoney) {
        this.amounMoney = amounMoney;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "id=" + id +
                ", amounMoney=" + amounMoney +
                '}';
    }
}
