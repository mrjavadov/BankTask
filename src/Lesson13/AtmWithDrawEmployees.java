package Lesson13;

import java.util.ArrayList;
import java.util.List;

public class AtmWithDrawEmployees {
    private Long id;
    private Atm atms;
    private List<Employee> employee;

    public AtmWithDrawEmployees(Long id, Atm atms) {
        this.id = id;
        this.atms = atms;
        this.employee=new ArrayList<>();
    }
}
