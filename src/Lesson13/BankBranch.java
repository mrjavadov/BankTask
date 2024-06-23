package Lesson13;

public class BankBranch {
    private Long id;
    private String adress;
    private Bank bank;
    private Atm atms;

    public BankBranch(Long id,String adress) {
        this.id = id;
        this.adress = adress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "BankBranch{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                '}';
    }
}
