package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class AzeriCardReport {
    private Long id;
    private List<Atm> atms;
    private ReportEmployees reportEmployees;

    public AzeriCardReport(Long id) {
        this.id = id;
        this.atms=new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AzeriCardReport{" +
                "id=" + id +
                '}';
    }
}
