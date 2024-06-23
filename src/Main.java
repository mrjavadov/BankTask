import Lesson13.Bank;
import Lesson13.Customer;
import Lesson13.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bank express = new Bank(1L,"express");
        Bank leobank  = new Bank(2L,"leobank");

        Customer ferid = new Customer(1L,"ferid","Seki seheri",123449023L,"mirashovfarid@gmail.com");
        Customer aqil = new Customer(2L,"Aqil","Lerik rayonu",134555L,"agilgasimzada@gmail.com");


        List<Bank> banks = new ArrayList<>();
        banks.add(express);
        banks.add(leobank);

        List<Customer> customers = new ArrayList<>();
        customers.add(ferid);
        customers.add(aqil);


        Employee employee = new Employee(1L,"Ferid",3000,"Seki Seheri",12345666L,"ac1234gh");
        Employee employee2 = new Employee(2L,"Aqil",4000,"Lerik seheri",122222L,"ac1234444");


    }
}
