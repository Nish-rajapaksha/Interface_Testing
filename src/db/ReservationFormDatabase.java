package db;

import model.Customer;

import java.util.ArrayList;

public class ReservationFormDatabase {
    public static ArrayList<Customer> customerTable=new ArrayList<Customer>();

    static {

        customerTable.add(
                new Customer(014,"Nisun","Nisun@gmail.com",14)
        );
        customerTable.add(
                new Customer(034,"Dasun","Dasun@gmail.com",12)
        );

    }
}
